package microservices.book.multiplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowireDITestService {
	private SampleService sampleService;
	
	//Constructor DI
	@Autowired
	public AutowireDITestService(SampleService sampleService) {
		this.sampleService = sampleService;
	}

	public SampleService getSampleService() {
		return sampleService;
	}
	

}
