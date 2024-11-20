package microservices.book.multiplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import microservices.book.multiplicacion.service.AutowireDIPropertyService;

@SpringBootApplication
public class ApplicationAutoWirePropertyDITest {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApplicationAutoWirePropertyDITest.class,args);
		AutowireDIPropertyService bean = (AutowireDIPropertyService)context.getBean("autowireDIPropertyService");
		bean.getDemoService().demo();
			
	}
}
