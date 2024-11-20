package microservices.book.multiplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowireDIPropertyService {
	
	@Autowired
	private DemoService demoService;
	
	public DemoService getDemoService() {
		return demoService;
	}
	

}
