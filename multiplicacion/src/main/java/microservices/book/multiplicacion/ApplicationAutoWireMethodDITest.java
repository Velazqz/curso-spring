package microservices.book.multiplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import microservices.book.multiplicacion.service.AutowireDITestService;

@SpringBootApplication
public class ApplicationAutoWireMethodDITest {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApplicationAutoWireMethodDITest.class, args);
		AutowireDITestService bean = (AutowireDITestService) context.getBean("autowireDITestService");
		bean.getExampleService().example();
	}
}
