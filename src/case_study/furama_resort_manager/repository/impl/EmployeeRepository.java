package case_study.furama_resort_manager.repository.impl;

import case_study.furama_resort_manager.model.person.Employee;
import case_study.furama_resort_manager.repository.IEmployeeRepository;
import case_study.furama_resort_manager.util.ReadAndWrite;


import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String PATH_FILE = "src\\case_study\\furama_resort_manager\\data\\employee_data.csv";

    @Override
    public List<Employee> display() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String string = stringList.get(i);
            String[] arr = string.split(",");
            Employee employee = new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Float.parseFloat(arr[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        stringList.add(employee.getInfoToEmployee());
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                ReadAndWrite.writeFile(PATH_FILE, stringList.get(i), false);
            } else {
                ReadAndWrite.writeFile(PATH_FILE, stringList.get(i), true);
            }
        }
    }

    @Override
    public void edit(Employee employee) {
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        stringList.add(employee.getInfoToEmployee());
        for (int i = 0; i < stringList.size(); i++) {

        }
    }
}
