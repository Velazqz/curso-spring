package microservices.book.multiplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import microservices.book.multiplicacion.service.Cajero;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class MultiplicacionApplication {

	public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(MultiplicacionApplication.class, args);
        Cajero cajeroBean = (Cajero)context.getBean("cajeroBean");
        cajeroBean.imprimirBalance("1112");
        String[] beanNames = context.getBeanDefinitionNames();
        System.out.println("******|Beans in our context|******");
        for(String beanName:beanNames) {
            System.out.println(beanName);
        }
	}
}
