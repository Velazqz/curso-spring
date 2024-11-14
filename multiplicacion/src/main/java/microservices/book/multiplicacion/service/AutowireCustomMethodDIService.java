package microservices.book.multiplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowireCustomMethodDIService {
	
	private ExampleService exampleService;

	public ExampleService getExampleService() {
		return exampleService;
	}
	@Autowired
	public void initialize(ExampleService exampleService) {
		this.exampleService = exampleService;
	}
	

}
