package lecture_04.classroom.clonning.deepClonning;

public class DeepCopy {
    public static void main(String[] args) {
        Department dept = new Department(1, "IT", "SSE");
        Employee emp = new Employee(1001, "Gautam", dept);
        Employee employee = null;

        try {
            employee = (Employee)emp.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(employee.dept.designation);
        employee.dept.designation = "VP";
        System.out.println(employee.dept.designation);
    }
}