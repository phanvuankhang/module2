package case_study.furama_resort_manager.service.impl;

import case_study.furama_resort_manager.model.person.Customer;
import case_study.furama_resort_manager.model.person.Employee;
import case_study.furama_resort_manager.service.ICustomerService;
import case_study.furama_resort_manager.util.CheckUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new ArrayList<>();

    @Override
    public void edit() {
        if (!customerList.isEmpty()) {
            System.out.println("Enter code of employee that you want to edit: ");
            String code = scanner.nextLine();
            boolean flag = true;
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getcustomerId().equals(code)) {
                    String address = null;
                    String name = null;
                    String birthDay = null;
                    String gender = null;
                    String personId = null;
                    String phoneNumber = null;
                    String email = null;
                    String typeGuest = null;
                    do {
                        System.out.println("Select the information you want to change: \n" +
                                "1.\tFirst and last name\n" +
                                "2.\tDate of birth\n" +
                                "3.\tGender\n" +
                                "4.\tID number\n" +
                                "5.\tPhone number\n" +
                                "6.\tEmail\n" +
                                "7.\tType of guest\n" +
                                "8.\tAddress\n" +
                                "9.\tExit");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("Enter your first and last name: ");
                                name = scanner.nextLine();
                                customerList.get(i).setName(name);
                                break;
                            case 2:
                                System.out.println("Enter date of birth: ");
                                birthDay = scanner.nextLine();
                                customerList.get(i).setBirthDay(birthDay);
                                break;
                            case 3:
                                System.out.println("Enter gender: ");
                                gender = scanner.nextLine();
                                customerList.get(i).setGender(gender);
                                break;
                            case 4:
                                System.out.println("Enter ID number: ");
                                personId = scanner.nextLine();
                                customerList.get(i).setPersonId(personId);
                                break;
                            case 5:
                                System.out.println("Enter phone number: ");
                                phoneNumber = scanner.nextLine();
                                customerList.get(i).setPhoneNumber(phoneNumber);
                                break;
                            case 6:
                                System.out.println("Enter email: ");
                                email = scanner.nextLine();
                                customerList.get(i).setEmail(email);
                                break;
                            case 7:
                                System.out.println("Enter type of guest: ");
                                boolean flag1=true;
                                typeGuest ="";
                                do {
                                    System.out.println("Type of guest:\n" +
                                            "1.\tDiamond\n" +
                                            "2.\tPlatinium\n" +
                                            "3.\tGold\n" +
                                            "4.\tSilver\n" +
                                            "5.\tMember\n" );
                                    int choice1=Integer.parseInt(scanner.nextLine());
                                    switch (choice1){
                                        case 1:
                                            typeGuest="Diamond";
                                            flag1=false;
                                            break;
                                        case 2:
                                            typeGuest="Platinium";
                                            flag1=false;
                                            break;
                                        case 3:
                                            typeGuest="Gold";
                                            flag1=false;
                                            break;
                                        case 4:
                                            typeGuest="Silver";
                                            flag1=false;
                                            break;
                                        case 5:
                                            typeGuest="Member";
                                            flag1=false;
                                            break;
                                        default:
                                            System.out.println("Wrong format. Enter again!");
                                    }
                                }while (flag1);
                                customerList.get(i).setTypeGuest(typeGuest);
                                break;
                            case 8:
                                System.out.println("Enter address: ");
                                address = scanner.nextLine();
                                customerList.get(i).setAddress(address);
                                break;
                            case 9:
                                System.out.println("Exit");
                                flag = false;
                                break;
                            default:
                                System.out.println("Wrong format. Enter again!");
                        }
                    } while (flag);
                    Customer customer = new Customer(name, birthDay, gender, personId, phoneNumber, email, typeGuest, address);
                    System.out.println(customer);
                }
            }
        }
    }

    @Override
    public void display() {
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        System.out.println("enter employee code: ");
        String customerId = scanner.nextLine();
        int count=0;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getcustomerId().equals(customerId)) {
                System.out.println("Employee already exist!");
                return;
            }else {
                count++;
            }
        }
        System.out.println("Enter your first and last name: ");
        String name = scanner.nextLine();
        String birthDay;
        do {
            System.out.println("Enter date of birth: ");
            birthDay = scanner.nextLine();
        }while (!CheckUtils.checkDate(birthDay));
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter ID number: ");
        String personId = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter type of guest: ");
        boolean flag=true;
        String typeGuest ="";
        do {
            System.out.println("Type of guest:\n" +
                    "1.\tDiamond\n" +
                    "2.\tPlatinium\n" +
                    "3.\tGold\n" +
                    "4.\tSilver\n" +
                    "5.\tMember\n" );
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    typeGuest="Diamond";
                    flag=false;
                    break;
                case 2:
                    typeGuest="Platinium";
                    flag=false;
                    break;
                case 3:
                    typeGuest="Gold";
                    flag=false;
                    break;
                case 4:
                    typeGuest="Silver";
                    flag=false;
                    break;
                case 5:
                    typeGuest="Member";
                    flag=false;
                    break;
                default:
                    System.out.println("Wrong format. Enter again!");
            }
        }while (flag);
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(customerId, name, birthDay, gender, personId, phoneNumber, email, typeGuest, address);
        customerList.add(customer);
        System.out.println("Successfully added new.");
    }
}
