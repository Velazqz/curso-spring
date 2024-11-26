package microservices.book.multiplicacion;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import microservices.book.multiplicacion.dao.EmployeeDAO;
import microservices.book.multiplicacion.model.Employee;

import org.springframework.context.ApplicationContext;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class MultiplicacionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MultiplicacionApplication.class, args);
		EmployeeDAO employeeDAO = (EmployeeDAO)context.getBean("oracleEmployeeDAO");
		int numReg = 0;
		
		System.out.println("Leer empleado con employee_id:199");
		Employee employee = employeeDAO.getEmployeeById(199);
		System.out.println(imprimirEmployee(employee));
		
		System.out.println("\nTodos los empleados");
		List<Employee> listEmp = employeeDAO.getAllEmployee();
		for(Employee e:listEmp) {
			System.out.println(e.getEmployeeId()+"," + e.getFirstName() + ", " +
		                       e.getLastName());
		}
		
		
		System.out.println("Borrar en empleado");
		numReg = employeeDAO.deleteEmployee(300);
		System.out.println("Empleado borrado con ID: " + numReg);
	
		
		System.out.println("Insertar empleado");
		LocalDate fecha = LocalDate.now();
		employee = new Employee(300,"Morales","jmorales111@gmail.com",Date.valueOf(fecha),"SA_REP");
		employee.setFirstName("Javier");
		employee.setPhoneNumber("5534121110");
        employee.setDepartmentId(230);
        employee.setManagerId(195);
        employee.setSalary(new BigDecimal(3000));
        
        numReg = employeeDAO.insertEmployee(employee);
        System.out.println("ID del empleado insertado: " + numReg);
        
	}
	
	public static String imprimirEmployee(Employee employee) {
		return " employee_id:   " + employee.getEmployeeId() +
			   " first_name:    " + employee.getFirstName() +
			   " last_name:     " + employee.getLastName() +
			   " email:         " + employee.getEmail() +
			   " phone_number:  " + employee.getPhoneNumber() +
			   " hire_date:     " + employee.getHireDate() +
			   " job_id:        " + employee.getJobId() +
			   " salary:        " + employee.getSalary() +
			   " commission_pct:" + employee.getComissionPct() +
			   " manager_id:    " + employee.getManagerId() +
			   " department_id: " + employee.getDepartmentId();
	}

}
