package case_study.furama_resort_manager.service.impl;

import case_study.furama_resort_manager.model.facility.Facility;
import case_study.furama_resort_manager.service.IFacilityService;
import case_study.furama_resort_manager.service.IHouseService;
import case_study.furama_resort_manager.service.IRoomService;
import case_study.furama_resort_manager.service.IVillaService;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    static Scanner scanner=new Scanner(System.in);
    static LinkedHashMap<Facility,Integer> facilityIntegerLinkedHashMap=new LinkedHashMap<>();
    static IHouseService houseService=new HouseService();
    static IVillaService villaService=new VillaService();
    static IRoomService roomService=new RoomService();
    @Override
    public void display() {
        System.out.println("Display list facility");
        System.out.println("Display list Villa");
        villaService.display();
        System.out.println("Display list House");
        houseService.display();
        System.out.println("Display list Room");
        roomService.display();
    }

    @Override
    public void add() {
        boolean flag=true;
        do {
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n");
        int choice=Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    villaService.add();
                    break;
                case 2:
                    houseService.add();
                    break;
                case 3:
                    roomService.add();
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    System.out.println("Wrong format. Enter again!");
            }
        }while (flag);
    }

    @Override
    public void displayMaintenance() {

    }
}
