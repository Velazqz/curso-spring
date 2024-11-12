package microservices.book.multiplicacion;

<<<<<<< Updated upstream
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
=======
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import microservices.book.multiplicacion.service.GreetingMessageService;
>>>>>>> Stashed changes

@SpringBootApplication
public class MultiplicacionApplication {

	public static void main(String[] args) {
<<<<<<< Updated upstream
		SpringApplication.run(MultiplicacionApplication.class, args);
	}

=======
		ApplicationContext ctx = SpringApplication.run(MultiplicacionApplication.class,args);
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
		 System.out.println(beanName); 
		}
	  } 
>>>>>>> Stashed changes
}
