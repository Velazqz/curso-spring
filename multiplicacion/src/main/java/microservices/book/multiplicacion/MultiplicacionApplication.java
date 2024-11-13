package microservices.book.multiplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import microservices.book.multiplicacion.service.EmployeeServiceImpl;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class MultiplicacionApplication {

	public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(MultiplicacionApplication.class, args);
        EmployeeServiceImpl employeeService = (EmployeeServiceImpl)context.getBean("employeeServiceBean");
        employeeService.setMessage("bean1");
        System.out.println(employeeService.getMessage());
        EmployeeServiceImpl employeeService2 = (EmployeeServiceImpl)context.getBean("employeeServiceBean");
        System.out.println(employeeService2.getMessage());
        
   }
}
