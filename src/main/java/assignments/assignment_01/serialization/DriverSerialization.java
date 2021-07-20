package assignments.assignment_01.serialization;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DriverSerialization {
    public static void main(String[] args) throws Exception{
        new DriverSerialization().exportEmployeeInfo(listOfEmployee());
    }

    public void exportEmployeeInfo(List<EmployeeSerialize> list) throws Exception{
        System.out.println("Please directory location : *c:/target/folder* pattern ");
        Scanner sc = new Scanner(System.in);
        String outputPath  = sc.nextLine();
        String path = outputPath+"/export.txt";
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        Files.write(Paths.get(path), 
        list.stream().map(x -> x.toString()).collect(Collectors.toList()),
        StandardOpenOption.CREATE);
        System.out.println("Employee Information is exported at : "+path);
    }

    public static List<EmployeeSerialize> listOfEmployee(){
        EmployeeSerialize emp ;
        List<EmployeeSerialize> listOfEmployee = new ArrayList<>(10);
        for(int i=1; i<=10; i++){
            emp = new EmployeeSerialize();
            emp.setEmpName("emp"+i);
            emp.setAge(25+i);
            String gender = i%2 == 0 ? "MALE" : "FEMALE";
            emp.setGender(gender);
            listOfEmployee.add(emp);
        }
        return listOfEmployee;
    }
}
