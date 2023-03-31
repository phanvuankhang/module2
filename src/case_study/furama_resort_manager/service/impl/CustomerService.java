package case_study.furama_resort_manager.service.impl;

import case_study.furama_resort_manager.model.person.Customer;
import case_study.furama_resort_manager.model.person.Employee;
import case_study.furama_resort_manager.service.ICustomerService;

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
                                typeGuest = scanner.nextLine();
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
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getcustomerId().equals(customerId)) {
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
        System.out.println("Enter type of guest: ");
        String typeGuest = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(customerId, name, birthDay, gender, personId, phoneNumber, email, typeGuest, address);
        customerList.add(customer);
        System.out.println("Successfully added new.");
    }
}
