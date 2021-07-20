package lecture_04.classroom.clonning.deepClonning;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable {
    private static final long serialVersionUID = -2153730593049041279L;
    private final int empId;
    private final String empName;
    Department dept;

    public Employee(int empId, String empName, Department dept){
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Employee emp = (Employee)super.clone();
        emp.dept = (Department)dept.clone();
        return emp;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Department getDept() throws CloneNotSupportedException{
        this.dept = (Department)dept.clone();
        return this.dept;
    }    
}

class Department implements Serializable, Cloneable{
    private static final long serialVersionUID = 736788330480511416L;
    private final int deptId;
    private final String deptName;
    String designation;

    public Department(int deptId, String deptName, String designation){
        this.deptId = deptId;
        this.deptName = deptName;
        this.designation = designation;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public int getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getDesignation(){
        return new String(designation);
    }    
}
