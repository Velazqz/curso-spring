package microservices.book.multiplicacion.service;

import microservices.book.multiplicacion.pojo.Employee;

public class EmployeeService {
	
    private Employee employee;
    
    /*public EmployeeService(Employee employee) {
    	this.employee = employee;
    }*/

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	@Override
    public String toString() {
        return employee.toString();
    }

}
