package microservices.book.multiplicacion.service;

public class EmployeeService {
	
    private String employeeName;
    private int employeeAge;
    private String employeeId;

    public EmployeeService(String employeeName,int employeeAge,String employeeId){
        System.out.println("Primer constructor");
        this.employeeName=employeeName;
        this.employeeAge=employeeAge;
        this.employeeId=employeeId;
   }

    public EmployeeService(String employeeName,String employeeId,int employeeAge){
        System.out.println("Segundo constructor");
        this.employeeName=employeeName;
        this.employeeAge=employeeAge;
        this.employeeId=employeeId;
    }

    @Override
    public String toString() {
        return "Employee name: "+employeeName+" Age: "+employeeAge+" EmployeeId: "+employeeId;
    }

}
