package case_study.furama_resort_manager.util;

import case_study.furama_resort_manager.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    public static final String PATH_FILE="src\\case_study\\furama_resort_manager\\data\\employee_data.csv";
    public static List<String> readFile() {
        List<String> employeeList= new ArrayList<>();
        File file = new File(PATH_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String[] info;
            String line = "";
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                info=line.split(",");
                employee=new Employee();
                employee.setEmployeeId(info[0]);
                employee.setName(info[1]);
                employee.setBirthDay(info[2]);
                employee.setGender(info[3]);
                employee.setPersonId(info[4]);
                employee.setPhoneNumber(info[5]);
                employee.setEmail(info[6]);
                employee.setLevel(info[7]);
                employee.setLocation(info[8]);
                employee.setWage(Float.parseFloat(info[9]));
                employeeList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }

    public static void writeFile(List<Employee> employeeList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(PATH_FILE, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.getInfoToEmployee());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
