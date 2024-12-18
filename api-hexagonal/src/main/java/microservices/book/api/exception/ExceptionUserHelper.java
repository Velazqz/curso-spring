package microservices.book.api.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;

@ControllerAdvice
public class ExceptionUserHelper {
	// Handler
	@ExceptionHandler(value= {NotFoundException.class})
	public ResponseEntity<Object> handleNotFoundUserException(NotFoundException e){
		ErrorResponse er = new ErrorResponse();
		er.setTimestamp(Instant.now().toEpochMilli());
		er.setStatus(404);
		er.setError("Not Found");
		er.setMessage("NOT_FOUND");
		er.setPath("/users");
		return new ResponseEntity<Object>(er,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value= {EmailAlreadyExistsException.class})
	public ResponseEntity<Object> handleEmailAlreadyExistsException(EmailAlreadyExistsException e){
		ErrorResponse er = new ErrorResponse();
		er.setTimestamp(Instant.now().toEpochMilli());
		er.setStatus(404);
		er.setError("Bad Request");
		er.setMessage("EMAIL_ALREADY EXISTS");
		er.setPath("/users");
		return new ResponseEntity<Object>(er,HttpStatus.BAD_REQUEST);
	}

	// "defaultMessage": "must match \"^(DEVELOPER|ADMINISTRATOR)$\""

	@ExceptionHandler(value= {MethodArgumentNotValidException.class})
	public ResponseEntity<Object> handleInvalidJSONArgument(MethodArgumentNotValidException e){
		ErrorResponse er = new ErrorResponse();
		for (FieldError fe : e.getBindingResult().getFieldErrors()) {
			if (fe.getDefaultMessage().equals("must match \"^(DEVELOPER|ADMINISTRATOR)$\"")){
				er.setTimestamp(Instant.now().toEpochMilli());
				er.setStatus(400);
				er.setError("Bad Request");
				er.setMessage("INVALID_ROLE");
				er.setPath("/users");
				break;
			} else {
				er.setTimestamp(Instant.now().toEpochMilli());
				er.setStatus(400);
				er.setError("Bad Request");
				er.setMessage("INVALID_JSON_BODY");
				er.setPath("/users");
				break;
			}
		}
		return new ResponseEntity<Object>(er,HttpStatus.BAD_REQUEST);
	}

}
