package microservices.book.multiplicacion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name="HIRE_DATE")
	private Date hireDate;
	
	@Column(name="JOB_ID")
	private String jobId;
	
	@Column(name="SALARY")
	private BigDecimal salary;
	
	@Column(name="COMMISSION_PCT")
	private BigDecimal comissionPct;
	
	@Column(name="MANAGER_ID")
	private Integer managerId;
	
	@Column(name="DEPARTMENT_ID")
	private Integer departmentId;
	
	public Employee() {}

	public Employee(int employeeId, String lastName, 
			        String email, Date hireDate, String jobId) {
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.email = email;
		this.hireDate = hireDate;
		this.jobId = jobId;
	}

	public Employee(int employeeId, String lastName,
			String email, Date hireDate,String jobId,String firstName,
			String phoneNumber,BigDecimal salary, BigDecimal comissionPct,
			Integer managerId, Integer departmentId) {
		
	    this(employeeId,lastName,email,hireDate,jobId);
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.comissionPct = comissionPct;
		this.managerId = managerId;
		this.departmentId = departmentId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public BigDecimal getComissionPct() {
		return comissionPct;
	}

	public void setComissionPct(BigDecimal comissionPct) {
		this.comissionPct = comissionPct;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Employee)) {
			return false;
		}
		Employee employee = (Employee)obj;
		
		if(firstName != null ? !firstName.equals(employee.getFirstName()):employee.firstName != null) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public int hashCode() {
		return firstName != null ? firstName.hashCode():0;
	}
	
	
	
	
	

}
