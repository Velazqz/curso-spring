package microservices.book.multiplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import microservices.book.multiplicacion.service.EmployeeService;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class MultiplicacionApplication {

	public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(MultiplicacionApplication.class, args);
        EmployeeService employeeService = (EmployeeService)context.getBean("employeeServiceBean");
        System.out.println(employeeService);
        String[] beanNames = context.getBeanDefinitionNames();
        System.out.println("******|Beans in our context|******");
        for(String beanName:beanNames) {
            System.out.println(beanName);
        }
	}
}
