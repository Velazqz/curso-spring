package microservices.book.multiplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowireDITestService {
	
	private ExampleService exampleService;
	
	@Autowired
	public void setExampleService(ExampleService exampleService) {
		this.exampleService = exampleService;
	}


	public ExampleService getExampleService() {
		return exampleService;
	}
	

}