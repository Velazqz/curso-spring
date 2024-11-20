package microservices.book.multiplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import microservices.book.multiplicacion.service.OptionalDIService;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OptionalDIServiceTest {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OptionalDIServiceTest.class, args);
		OptionalDIService bean =context.getBean(OptionalDIService.class);
		bean.doStuff();
		
	}

}