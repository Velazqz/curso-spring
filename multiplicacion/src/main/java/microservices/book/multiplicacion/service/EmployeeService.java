package microservices.book.multiplicacion.service;

public class EmployeeService {
    private String greeting;

    public EmployeeService(String greeting){
		this.greeting = greeting;
    }

    @Override
    public String toString() {
        return this.greeting;
    }
 }
