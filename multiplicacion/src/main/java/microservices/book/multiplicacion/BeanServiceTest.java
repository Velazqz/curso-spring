package microservices.book.multiplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import microservices.book.multiplicacion.service.BeanService;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanServiceTest {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BeanServiceTest.class, args);
		BeanService bean =context.getBean(BeanService.class);
		System.out.println(bean.getBean().getName());
		
	}

}