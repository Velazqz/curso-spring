package microservices.book.multiplication.controller;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import microservices.book.multiplication.dto.UserResponse;
import microservices.book.multiplication.dto.UserUpdateRequest;
import microservices.book.multiplication.model.User;
import microservices.book.multiplication.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	private IUserService userService;
		
	@GetMapping
	public ResponseEntity<Iterable<UserResponse>> 
	       getUsers(@RequestParam(required=false,defaultValue="0") String page,
	                @RequestParam(required=false,defaultValue="20") String size,
	            	@RequestParam(required=false,defaultValue="creationDate,desc") String[] sort){
		
		int pageInt = Integer.valueOf(page);
		int sizeInt = Integer.valueOf(size);
		ArrayList<UserResponse> userResponse;
		
		userResponse = userService.findAll(pageInt, sizeInt, sort);
		// Headers
	    long numberRows = userService.count();
		HttpHeaders headers = new HttpHeaders();
		headers.add("Total-Elements", String.valueOf(numberRows));
		
		return new ResponseEntity<>(userResponse,headers,HttpStatus.OK);
		
	}
	
	
	
	@GetMapping("/{id}")
	public Optional<User> getUser(@PathVariable UUID id) {
		
		Optional<User> user = userService.getUser(id);
		return user;

	}
	
	
	
	@PutMapping("/{id}")
	public ResponseEntity<User> putUser(@PathVariable UUID id,
			                            @Valid @RequestBody UserUpdateRequest userUpdateRequest){
		
		
		ResponseEntity<User> response = null;
		User user = null;
		user = userService.putUser(id, userUpdateRequest);
		response = new ResponseEntity<>(user,HttpStatus.OK);
	
		return response;
		
	}
	
	
	

}
