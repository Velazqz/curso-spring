package microservices.book.multiplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import microservices.book.multiplicacion.service.AutowireByQualifierService;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutowireByQualifierServiceTest {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AutowireByQualifierServiceTest.class, args);
		AutowireByQualifierService bean =context.getBean(AutowireByQualifierService.class);
		bean.printResult();
		
	}
}
