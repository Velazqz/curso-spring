package microservices.book.multiplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanService {
	
	@Autowired
	@Qualifier("bean2")
	private BeanInterface bean;
	
	public BeanInterface getBean() {
		return bean;
	}

}
