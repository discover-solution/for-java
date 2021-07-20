package assignments.assignment_01.serialization;

import java.io.Serializable;

public class EmployeeSerialize implements Serializable{
    private static final long serialVersionUID = 1731574077003476013L;
    
    private String empName;
    private int age;
    private String gender;

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return String.format("%s,%s,%s \n", empName,age,gender);
    }
}
