package case_study.furama_resort_manager.controllers;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("--KHU NGHỈ DƯỠNG FURAMA--\n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    EmployeeController.displayEmployee();
                    break;
                case 2:
                    CustomerController.displayCustomer();
                    break;
                case 3:
                    FacilityController.displayFacility();
                    break;
                case 4:
                    BookingController.displayBooking();
                    break;
                case 5:
                    PromotionController.displayPromotion();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong format. Enter again!");
            }
        } while (flag);
    }
}
