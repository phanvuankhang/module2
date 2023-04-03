package case_study.furama_resort_manager.controllers;

import case_study.furama_resort_manager.service.ICustomerService;
import case_study.furama_resort_manager.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    public static Scanner scanner=new Scanner(System.in);
    static ICustomerService customerService=new CustomerService();
    public static void displayCustomer(){
        boolean flag=true;
        do {
            System.out.println("----------CUSTOMER----------\n" +
                    "1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    System.out.println("Wrong format. Enter again!");
            }
        }while (flag);
    }
}
