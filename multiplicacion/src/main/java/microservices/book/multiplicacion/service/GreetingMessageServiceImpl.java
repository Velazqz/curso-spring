package microservices.book.multiplicacion.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingMessageServiceImpl implements GreetingMessageService{

	@Override
	public String getUsers() {
		return "primer programa de Spring Boot";
	}
	
}
