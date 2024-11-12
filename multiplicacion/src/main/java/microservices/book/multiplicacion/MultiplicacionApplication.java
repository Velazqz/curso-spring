package microservices.book.multiplicacion;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import microservices.book.multiplicacion.service.GreetingMessageService;

@SpringBootApplication
public class MultiplicacionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MultiplicacionApplication.class,args);
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
		System.out.println(beanName);
		}
	}
}
