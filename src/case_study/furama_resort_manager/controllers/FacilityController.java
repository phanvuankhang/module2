package case_study.furama_resort_manager.controllers;

import case_study.furama_resort_manager.service.IFacilityService;
import case_study.furama_resort_manager.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    public static Scanner scanner=new Scanner(System.in);
    public static IFacilityService facilityService=new FacilityService();
    public static void displayFacility(){
        boolean flag=true;
        do {
            System.out.println("----------FACILITY----------\n" +
                    "1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            String choice=scanner.nextLine();
            switch (choice){
                case "1":
                    facilityService.display();
                    break;
                case "2":
                    facilityService.add();
                    break;
                case "3":
                    facilityService.displayMaintenance();
                    break;
                case "4":
                    flag=false;
                    break;
                default:
                    System.out.println("Wrong format. Enter again!");
            }
        }while (flag);
    }
}
