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
        EmployeeServiceImpl employeeService1 = (EmployeeServiceImpl) context.getBean("employeeServiceBean");
        EmployeeServiceImpl employeeService2 = (EmployeeServiceImpl) context.getBean("employeeServiceBean");

        // Check if they are the same instance
        if (employeeService1 == employeeService2) {
            System.out.println("Same instance");
        } else {
            System.out.println("Different instances");
        }
	}
}
