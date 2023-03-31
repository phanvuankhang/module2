package case_study.furama_resort_manager.service.impl;

import case_study.furama_resort_manager.model.person.Employee;
import case_study.furama_resort_manager.service.IEmployeeService;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    static Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void display() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        System.out.println("enter employee code: ");
        String employeeId = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId().equals(employeeId)) {
                System.out.println("Employee already exist!");
                return;
            }
        }
        System.out.println("Enter your first and last name: ");
        String name = scanner.nextLine();
        System.out.println("Enter date of birth: ");
        String birthDay = scanner.nextLine();
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter ID number: ");
        String personId = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter level: ");
        String level = scanner.nextLine();
        System.out.println("Enter location: ");
        String location = scanner.nextLine();
        System.out.println("Enter salary: ");
        float wage = Float.parseFloat(scanner.nextLine());
        Employee employee = new Employee(employeeId, name, birthDay, gender, personId, phoneNumber, email, level, location, wage);
        employeeList.add(employee);
        System.out.println("Successfully added new.");
    }

    @Override
    public void edit() {
        if (!employeeList.isEmpty()) {
            System.out.println("Enter code of employee that you want to edit: ");
            String code = scanner.nextLine();
            boolean flag = true;
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getEmployeeId().equals(code)) {
                    String name = null;
                    String birthDay = null;
                    String gender = null;
                    String personId = null;
                    String phoneNumber = null;
                    String email = null;
                    String level = null;
                    String location = null;
                    float wage = 0;
                    do {
                        System.out.println("Select the information you want to change: \n" +
                                "1.\tFirst and last name\n" +
                                "2.\tDate of birth\n" +
                                "3.\tGender\n" +
                                "4.\tID number\n" +
                                "5.\tPhone number\n" +
                                "6.\tEmail\n" +
                                "7.\tLevel\n" +
                                "8.\tLocation\n" +
                                "9.\tSalary\n" +
                                "10.\tExit");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("Enter your first and last name: ");
                                name = scanner.nextLine();
                                employeeList.get(i).setName(name);
                                break;
                            case 2:
                                System.out.println("Enter date of birth: ");
                                birthDay = scanner.nextLine();
                                employeeList.get(i).setBirthDay(birthDay);
                                break;
                            case 3:
                                System.out.println("Enter gender: ");
                                gender = scanner.nextLine();
                                employeeList.get(i).setGender(gender);
                                break;
                            case 4:
                                System.out.println("Enter ID number: ");
                                personId = scanner.nextLine();
                                employeeList.get(i).setPersonId(personId);
                                break;
                            case 5:
                                System.out.println("Enter phone number: ");
                                phoneNumber = scanner.nextLine();
                                employeeList.get(i).setPhoneNumber(phoneNumber);
                                break;
                            case 6:
                                System.out.println("Enter email: ");
                                email = scanner.nextLine();
                                employeeList.get(i).setEmail(email);
                                break;
                            case 7:
                                System.out.println("Enter level: ");
                                level = scanner.nextLine();
                                employeeList.get(i).setLevel(level);
                                break;
                            case 8:
                                System.out.println("Enter location: ");
                                location = scanner.nextLine();
                                employeeList.get(i).setLocation(location);
                                break;
                            case 9:
                                System.out.println("Enter salary: ");
                                wage = Float.parseFloat(scanner.nextLine());
                                employeeList.get(i).setWage(wage);
                                break;
                            case 10:
                                System.out.println("Exit");
                                flag = false;
                                break;
                            default:
                                System.out.println("Wrong format. Enter again!");
                        }
                    } while (flag);
                    Employee employee = new Employee(name, birthDay, gender, gender, personId, phoneNumber, email, level, location, wage);
                    System.out.println(employee);
                }
            }
        }
    }
}
