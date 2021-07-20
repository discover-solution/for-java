package lecture_04.classroom.clonning.shallowClonning;

public class Employee implements Cloneable {
    int empId;
    String empName;
    Department dept;

    public Employee(int empId, String empName, Department dept){
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
