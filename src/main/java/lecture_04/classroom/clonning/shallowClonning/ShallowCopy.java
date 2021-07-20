package lecture_04.classroom.clonning.shallowClonning;

public class ShallowCopy {
    public static void main(String[] args) {
        Department dept = new Department(1, "GRADE - A", "SSE");

        Employee emp = new Employee(101, "Sonu", dept);
        Employee employee = null;

        try {
            employee =(Employee) emp.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(emp.dept.designation);// SSE
        employee.dept.designation = "Director";
        System.out.println(emp.dept.designation);// Director
    }   
}