package case_study.furama_resort_manager.controllers;

import case_study.furama_resort_manager.model.booking.Booking;
import case_study.furama_resort_manager.service.IBookingService;
import case_study.furama_resort_manager.service.IContractService;
import case_study.furama_resort_manager.service.impl.BookingService;
import case_study.furama_resort_manager.service.impl.ContractService;

import java.util.Scanner;

public class BookingController {
    public static Scanner scanner=new Scanner(System.in);
    static IBookingService bookingService=new BookingService();
    static IContractService contractService=new ContractService();
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
            String choice=scanner.nextLine();
            switch (choice){
                case "1":
                    bookingService.add();
                    break;
                case "2":
                    bookingService.display();
                    break;
                case "3":
                    contractService.add();
                    break;
                case "4":
                    contractService.display();
                    break;
                case "5":
                    contractService.edit();
                    break;
                case "6":
                    flag=false;
                    break;
                default:
                    System.out.println("Wrong format. Enter again!");
            }
        }while (flag);
    }
}
