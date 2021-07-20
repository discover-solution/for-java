package assignments.assignment_01.serialization.serialization_externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DriverClass {
    public static void main(String[] args) {
        EmployeeExternalize emp = new EmployeeExternalize("Sonu Singh", 1992);
        EmployeeExternalize newEmployee = null;
        //Serialize the EmployeeExternalize
        try{
            FileOutputStream fos = new FileOutputStream("C:/Users/q815527/Desktop/export.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.flush();
        }
        catch(Exception e){
            System.out.print(e);
        }

        //Deserialize the EmployeeExternalize
        try {
            FileInputStream fis = new FileInputStream("export.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            newEmployee = (EmployeeExternalize)ois.readObject();
            System.out.println(newEmployee);
        } catch (Exception e) {
            System.out.print(e);
        }

        // System.out.println("The Original Employee : "+emp);
        // System.out.println("The new Employee : "+newEmployee);
    }
}
