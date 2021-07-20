package assignments.assignment_01.custom_annotations.deprecated;

public class Employee {
    private Integer empId;
    private String empName;

    public Employee(Integer empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }

    @Deprecated
    public void printEmployee(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return "empId : "+empId+"\nempName : "+empName;
    }
}
