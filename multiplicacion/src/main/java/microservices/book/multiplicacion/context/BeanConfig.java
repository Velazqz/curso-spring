package microservices.book.multiplicacion.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Configuration;

import microservices.book.multiplicacion.model.Department;
import microservices.book.multiplicacion.model.Employee;

import java.util.Date;

@Configuration
public class BeanConfig {
	
	@Bean(name="empRec1")
	public Employee getEmpRecord1() {
		Employee empRec1 = new Employee();
		return empRec1;
	}
	
	@Bean(name="empRec2")
	@Scope("prototype")
	public Employee getEmpRecord2() {
		Employee empRec2 = new Employee();
		empRec2.setFirstName("Juan");
		empRec2.setLastName("Luna");
		empRec2.setAge(50);
		empRec2.setBirthDate(new Date());
		empRec2.setPosition("historian");
		empRec2.setDept(getDept2());
		return empRec2;
		
	}
	
	@Bean(name="empRec3")
	public Employee getEmpRecord3() {
		Employee empRec3 = new Employee("Jose","Rizal",
				           new Date(),101,90000.00,"scriber",
				           getDept3());
		return empRec3;
	}
	
	@Bean(name="dept1")
	public Department getDept1() {
		Department dept1 = new Department();
		return dept1;
	}
	
	@Bean(name="dept2")
	public Department getDept2() {
		Department dept2 = new Department();
		dept2.setDeptNo(13456);
		dept2.setDeptName("History department");
		return dept2;
	}
	
	@Bean(name="dept3")
	public Department getDept3() { 
		Department dept3 = new Department(56748,"Communication Department");
		return dept3;
		
	}

}
