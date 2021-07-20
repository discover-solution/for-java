package assignments.assignment_01.custom_annotations.author;

@AuthorAnnotation
public class Employee {
    private Integer empId;
    private String empName;
    private String empType;

    public Employee(Integer empId, String empName, String empType){
        this.empId = empId;
        this.empName = empName;
        this.empType = empType;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    @AuthorAnnotation(employeeType = "Contractor")
    public String getEmpType() {
        return empType;
    }

    @Override
    public String toString(){
        return "empId : "+empId+"\nempName : "+empName+"\nempType : "+empType;
    }

    public void printEmployee(){
        System.out.println(toString());
    }
}