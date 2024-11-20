package microservices.book.multiplicacion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import microservices.book.multiplicacion.context.BeanConfig;
import microservices.book.multiplicacion.model.Employee;

public class MultiplicacionApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanConfig.class);
		
		context.refresh();
		// Solicitar bean al spring container, este bean es prototype
		Employee empRec2 = (Employee)context.getBean("empRec2");
		System.out.println("Instance A prototype: " + empRec2.hashCode());
		Employee empRec2a = (Employee)context.getBean("empRec2");
		System.out.println("Instance B prototype: " + empRec2a.hashCode());
		
		// Solicitar bean singleton
		Employee empRec3 = (Employee)context.getBean("empRec3");
		System.out.println("Instance A singleton: " + empRec3.hashCode());
		Employee empRec3a = (Employee)context.getBean("empRec3");
		System.out.println("Instance B singleton: " + empRec3a.hashCode());
		
		String[] beanNames = context.getBeanDefinitionNames();
        System.out.println("******|Beans in our context|******");
        for(String beanName:beanNames) {
            System.out.println(beanName);
        }
        
        context.registerShutdownHook();
	}

}

