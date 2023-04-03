package case_study.furama_resort_manager.controllers;

import java.util.Scanner;

public class PromotionController {
    public static Scanner scanner=new Scanner(System.in);
    public static void displayPromotion(){
        boolean flag=true;
        do {
            System.out.println("----------PROMOTION-----------\n" +
                    "1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    flag=false;
                    break;
                default:
                    System.out.println("Wrong format. Enter again!");
            }
        }while (flag);
    }
}
