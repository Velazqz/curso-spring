package microservices.book.multiplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import microservices.book.multiplicacion.service.AutowireByType;

@SpringBootApplication
public class AutowireByTypeTest {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AutowireByTypeTest.class, args);
		AutowireByType bean =context.getBean(AutowireByType.class);
		bean.printResult();
	}
}
