package microservices.book.multiplicacion.service;

public class EmployeeServiceImpl implements EmployeeService{

	private String message;


	@Override
	public String getMessage() {
		return this.message;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;		
	}


}
