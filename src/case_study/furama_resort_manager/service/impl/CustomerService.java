package case_study.furama_resort_manager.service.impl;

import case_study.furama_resort_manager.model.person.Customer;
import case_study.furama_resort_manager.repository.ICustomerRepository;
import case_study.furama_resort_manager.repository.impl.CustomerRepository;
import case_study.furama_resort_manager.service.ICustomerService;
import case_study.furama_resort_manager.util.CheckUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new ArrayList<>();
    static ICustomerRepository customerRepository=new CustomerRepository();
static boolean flag=true;
    @Override
    public void edit() {
        if (!customerList.isEmpty()) {
            System.out.println("Enter code of employee that you want to edit: ");
            String code = scanner.nextLine();
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
                        String choice = scanner.nextLine();
                        switch (choice) {
                            case "1":
                                System.out.println("Enter your first and last name: ");
                                name = scanner.nextLine();
                                customerList.get(i).setName(name);
                                break;
                            case "2":
                                System.out.println("Enter date of birth: ");
                                birthDay = scanner.nextLine();
                                customerList.get(i).setBirthDay(birthDay);
                                break;
                            case "3":
                                System.out.println("Enter gender: ");
                                gender = scanner.nextLine();
                                customerList.get(i).setGender(gender);
                                break;
                            case "4":
                                System.out.println("Enter ID number: ");
                                personId = scanner.nextLine();
                                customerList.get(i).setPersonId(personId);
                                break;
                            case "5":
                                System.out.println("Enter phone number: ");
                                phoneNumber = scanner.nextLine();
                                customerList.get(i).setPhoneNumber(phoneNumber);
                                break;
                            case "6":
                                System.out.println("Enter email: ");
                                email = scanner.nextLine();
                                customerList.get(i).setEmail(email);
                                break;
                            case "7":
                                System.out.println("Enter type of guest: ");
                                typeGuest ="";
                                do {
                                    System.out.println("Type of guest:\n" +
                                            "1.\tDiamond\n" +
                                            "2.\tPlatinium\n" +
                                            "3.\tGold\n" +
                                            "4.\tSilver\n" +
                                            "5.\tMember\n" );
                                    String choice1=scanner.nextLine();
                                    switch (choice1){
                                        case "1":
                                            typeGuest="Diamond";
                                            flag=false;
                                            break;
                                        case "2":
                                            typeGuest="Platinium";
                                            flag=false;
                                            break;
                                        case "3":
                                            typeGuest="Gold";
                                            flag=false;
                                            break;
                                        case "4":
                                            typeGuest="Silver";
                                            flag=false;
                                            break;
                                        case "5":
                                            typeGuest="Member";
                                            flag=false;
                                            break;
                                        default:
                                            System.out.println("Wrong format. Enter again!");
                                    }
                                }while (flag);
                                customerList.get(i).setTypeGuest(typeGuest);
                                break;
                            case "8":
                                System.out.println("Enter address: ");
                                address = scanner.nextLine();
                                customerList.get(i).setAddress(address);
                                break;
                            case "9":
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
        customerList=customerRepository.display();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        System.out.println("Enter customer code: ");
        String customerId = scanner.nextLine();
        int count=0;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getcustomerId().equals(customerId)) {
                System.out.println("Customer already exist!");
                return;
            }else {
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
        System.out.println("Enter type of guest: ");
        String typeGuest ="";
        do {
            System.out.println("Type of guest:\n" +
                    "1.\tDiamond\n" +
                    "2.\tPlatinium\n" +
                    "3.\tGold\n" +
                    "4.\tSilver\n" +
                    "5.\tMember\n" );
            String choice=scanner.nextLine();
            switch (choice){
                case "1":
                    typeGuest="Diamond";
                    flag=false;
                    break;
                case "2":
                    typeGuest="Platinium";
                    flag=false;
                    break;
                case "3":
                    typeGuest="Gold";
                    flag=false;
                    break;
                case "4":
                    typeGuest="Silver";
                    flag=false;
                    break;
                case "5":
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
        customerRepository.add(customer);
        System.out.println("Successfully added new.");
    }
}
