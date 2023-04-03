package case_study.furama_resort_manager.controllers;

import java.util.Scanner;

public class BookingController {
    public static Scanner scanner=new Scanner(System.in);
    public static void displayBooking(){
        boolean flag=true;
        do {
            System.out.println("----------BOOKING----------\n" +
                    "1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new contract\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    flag=false;
                    break;
                default:
                    System.out.println("Wrong format. Enter again!");
            }
        }while (flag);
    }
}
