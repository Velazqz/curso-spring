package microservices.book.multiplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import microservices.book.multiplicacion.service.AutowireDITestService;

@SpringBootApplication
public class ApplicationAutoWireDemo {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApplicationAutoWireDemo.class, args);
		AutowireDITestService bean = context.getBean(AutowireDITestService.class);
		bean.getSampleService().sample();
	}
}
