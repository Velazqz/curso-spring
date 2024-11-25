package microservices.book.multiplicacion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "EMPLOYEE_ID")
	private int employeeId;
	
	@Column(name = "FIRST_NAME")
	private String firtsName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name = "HIRE_DATE")
	private Date hireDate;
	
	@Column(name = "JOB_ID")
	private String jobId;
	
	@Column(name = "SALARY")
	private BigDecimal salary;
	
	@Column(name = "COMISSION_PCT")
	private BigDecimal comission_pct;
	
	@Column(name = "MANAGER_ID")
	private Integer managerId;
	
	@Column(name = "DEPARTMENT_ID")
	private Integer departmentId;

	public Employee(int employeeId, String lastName, String email, Date hireDate, String jobId) {
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.email = email;
		this.hireDate = hireDate;
		this.jobId = jobId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
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

	public BigDecimal getComission_pct() {
		return comission_pct;
	}

	public void setComission_pct(BigDecimal comission_pct) {
		this.comission_pct = comission_pct;
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
		if(!(obj instanceof Employee) ) {
			return false;
		}
		Employee employee = (Employee)obj;
		if(firtsName != null ? !firtsName.equals(employee.getFirtsName()) : employee.firtsName != null) {
			return false;
		}else {
			return true;
		}
	}
	
	@Override
	public int hashCode() {
		return firtsName != null ? firtsName.hashCode() : 0;
	}
	
}

