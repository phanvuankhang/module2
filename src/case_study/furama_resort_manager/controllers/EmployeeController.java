package case_study.furama_resort_manager.controllers;

import case_study.furama_resort_manager.service.IEmployeeService;
import case_study.furama_resort_manager.service.impl.EmployeeService;


import java.util.Scanner;

public class EmployeeController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayEmployee() {
        IEmployeeService employeeService = new EmployeeService();
        boolean flag = true;
        do {
            System.out.println("----------EMPLOYEE----------\n" +
                    "1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");
            String choice =scanner.nextLine();
            switch (choice) {
                case "1":
                    employeeService.display();
                    break;
                case "2":
                    employeeService.add();
                    break;
                case "3":
                    employeeService.edit();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong format. Enter again!");
            }
        } while (flag);
    }
}
