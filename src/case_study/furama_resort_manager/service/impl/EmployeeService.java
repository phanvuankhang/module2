package case_study.furama_resort_manager.service.impl;

import case_study.furama_resort_manager.model.person.Employee;
import case_study.furama_resort_manager.repository.IEmployeeRepository;
import case_study.furama_resort_manager.repository.impl.EmployeeRepository;
import case_study.furama_resort_manager.service.IEmployeeService;
import case_study.furama_resort_manager.util.CheckUtils;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class EmployeeService extends Employee implements IEmployeeService {
    static Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();
    private IEmployeeRepository employeeRepository=new EmployeeRepository();
    static boolean flag=true;


    @Override
    public void display() {
       employeeList=employeeRepository.display();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        System.out.println("enter employee code: ");
        String employeeId = scanner.nextLine();
        int count=0;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId().equals(employeeId)) {
                System.out.println("Employee already exist!");
                return;
            }else{
                count++;
            }
        }
        String name;
        do {
            System.out.println("Enter your first and last name: ");
            name = scanner.nextLine();
        }while (!CheckUtils.checkName(name));
        String birthDay;
        do {
            System.out.println("Enter date of birth: ");
            birthDay = scanner.nextLine();
        }while (!CheckUtils.checkDate(birthDay));
        System.out.println("Enter gender: ");
        String gender="";
        do {
            System.out.println("Gender:\n" +
                    "1.\tMale\n" +
                    "2.\tFemale\n" +
                    "3.\tOther");
            String choice=scanner.nextLine();
            switch (choice){
                case "1":
                    gender="Male";
                    flag=false;
                    break;
                case "2":
                    gender="Female";
                    flag=false;
                    break;
                case "3":
                    gender="Other";
                    flag=false;
                    break;
                default:
                    System.out.println("Wrong format. Enter again!");
            }
        }while (flag);
        System.out.println("Enter ID number: ");
        String personId = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter level: ");
        String level = "";
        do {
            System.out.println("Level:\n" +
                    "1.\tIntermediate\n" +
                    "2.\tCollege\n" +
                    "3.\tUniversity\n" +
                    "4.\tPostgraduate");
            String choice=scanner.nextLine();
            switch (choice){
                case "1":
                    level="Intermediate";
                    flag=false;
                    break;
                case "2":
                    level="College";
                    flag=false;
                    break;
                case "3":
                    level="University";
                    flag=false;
                    break;
                case "4":
                    level="Postgraduate";
                    flag=false;
                    break;
                default:
                    System.out.println("Wrong format. Enter again!");
            }
        }while (flag);
        System.out.println("Enter location: ");
        String location ="";
        do {
            System.out.println("Location:\n" +
                    "1.\tReception\n" +
                    "2.\tServe\n" +
                    "3.\tExpert\n" +
                    "4.\tMonitor\n" +
                    "5.\tManagement\n" +
                    "6.\tDirector");
            String choice=scanner.nextLine();
            switch (choice){
                case "1":
                    location="Reception";
                    flag=false;
                    break;
                case "2":
                    location="Serve";
                    flag=false;
                    break;
                case "3":
                    location="Expert";
                    flag=false;
                    break;
                case "4":
                    location="Monitor";
                    flag=false;
                    break;
                case "5":
                    location="Management";
                    flag=false;
                    break;
                case "6":
                    location="Director";
                    flag=false;
                    break;
                default:
                    System.out.println("Wrong format. Enter again!");
            }
        }while (flag);
        System.out.println("Enter salary: ");
        float wage = Float.parseFloat(scanner.nextLine());
        Employee employee = new Employee(employeeId, name, birthDay, gender, personId, phoneNumber, email, level, location, wage);
        employeeRepository.add(employee);
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
                        String choice = scanner.nextLine();
                        switch (choice) {
                            case "1":
                                System.out.println("Enter your first and last name: ");
                                name = scanner.nextLine();
                                employeeList.get(i).setName(name);
                                break;
                            case "2":
                                System.out.println("Enter date of birth: ");
                                birthDay = scanner.nextLine();
                                employeeList.get(i).setBirthDay(birthDay);
                                break;
                            case "3":
                                System.out.println("Enter gender: ");
                                gender = scanner.nextLine();
                                employeeList.get(i).setGender(gender);
                                break;
                            case "4":
                                System.out.println("Enter ID number: ");
                                personId = scanner.nextLine();
                                employeeList.get(i).setPersonId(personId);
                                break;
                            case "5":
                                System.out.println("Enter phone number: ");
                                phoneNumber = scanner.nextLine();
                                employeeList.get(i).setPhoneNumber(phoneNumber);
                                break;
                            case "6":
                                System.out.println("Enter email: ");
                                email = scanner.nextLine();
                                employeeList.get(i).setEmail(email);
                                break;
                            case "7":
                                System.out.println("Enter level: ");
                                level = "";
                                do {
                                    System.out.println("Level:\n" +
                                            "1.\tIntermediate\n" +
                                            "2.\tCollege\n" +
                                            "3.\tUniversity\n" +
                                            "4.\tPostgraduate");
                                    String choice1=scanner.nextLine();
                                    switch (choice1){
                                        case "1":
                                            level="Intermediate";
                                            flag=false;
                                            break;
                                        case "2":
                                            level="College";
                                            flag=false;
                                            break;
                                        case "3":
                                            level="University";
                                            flag=false;
                                            break;
                                        case "4":
                                            level="Postgraduate";
                                            flag=false;
                                            break;
                                        default:
                                            System.out.println("Wrong format. Enter again!");
                                    }
                                }while (flag);
                                break;
                            case "8":
                                System.out.println("Enter location: ");
                                location ="";
                                do {
                                    System.out.println("Location:\n" +
                                            "1.\tReception\n" +
                                            "2.\tServe\n" +
                                            "3.\tExpert\n" +
                                            "4.\tMonitor\n" +
                                            "5.\tManagement\n" +
                                            "6.\tDirector");
                                    String choice1=scanner.nextLine();
                                    switch (choice1){
                                        case "1":
                                            location="Reception";
                                            flag=false;
                                            break;
                                        case "2":
                                            location="Serve";
                                            flag=false;
                                            break;
                                        case "3":
                                            location="Expert";
                                            flag=false;
                                            break;
                                        case "4":
                                            location="Monitor";
                                            flag=false;
                                            break;
                                        case "5":
                                            location="Management";
                                            flag=false;
                                            break;
                                        case "6":
                                            location="Director";
                                            flag=false;
                                            break;
                                        default:
                                            System.out.println("Wrong format. Enter again!");
                                    }
                                }while (flag);
                                employeeList.get(i).setLocation(location);
                                break;
                            case "9":
                                System.out.println("Enter salary: ");
                                wage = Float.parseFloat(scanner.nextLine());
                                employeeList.get(i).setWage(wage);
                                break;
                            case "10":
                                System.out.println("Exit");
                                flag = false;
                                break;
                            default:
                                System.out.println("Wrong format. Enter again!");
                        }
                    } while (flag);
                    Employee employee = new Employee(name, birthDay, gender, gender, personId, phoneNumber, email, level, location, wage);
                    employeeRepository.add(employee);
                    System.out.println("successful fix");
                }
            }
        }
    }
}
