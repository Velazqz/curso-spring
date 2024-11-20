package microservices.book.multiplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import microservices.book.multiplicacion.service.ValueExample;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ValueExampleTest {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ValueExampleTest.class, args);
		ValueExample bean =context.getBean(ValueExample.class);
		System.out.println(bean);
		
	}

}