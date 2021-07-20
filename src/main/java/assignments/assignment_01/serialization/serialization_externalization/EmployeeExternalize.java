package assignments.assignment_01.serialization.serialization_externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeeExternalize implements Externalizable{
    String name;
    int dobYear;
    static int age;

    public EmployeeExternalize(){
        System.out.println("Defualt Construtor called.");
    }

    EmployeeExternalize(String n, int dobY){
        this.name = n;
        this.dobYear = dobY;
        age = 18;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(dobYear);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String)in.readObject();
        dobYear = in.readInt();
        age = in.readInt();
    }
    
    @Override
    public String toString(){
        return String.format("Name : %s, DOB_Year : %d, Age : %d", name,dobYear,age);
    }
}
