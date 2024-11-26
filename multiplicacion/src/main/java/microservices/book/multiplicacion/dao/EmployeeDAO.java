package microservices.book.multiplicacion.dao;

import java.util.List;

import microservices.book.multiplicacion.model.Employee;


public interface EmployeeDAO {
	
	Employee getEmployeeById(int id);
	List<Employee> getAllEmployee();
	int deleteEmployee(int id);
	int insertEmployee(Employee employee);
	

}
