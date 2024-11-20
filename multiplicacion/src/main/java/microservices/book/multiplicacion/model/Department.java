package microservices.book.multiplicacion.model;
	
public class Department {
	private Integer deptNo;
	private String deptName;
	
	public Department(){
		System.out.println("a department is created");
	}
	
	public Department(Integer deptNo,String deptName) {
		this.deptName = deptName;
		this.deptNo = deptNo;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}

