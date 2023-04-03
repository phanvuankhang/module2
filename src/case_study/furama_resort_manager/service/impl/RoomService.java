package case_study.furama_resort_manager.service.impl;
import case_study.furama_resort_manager.model.facility.Room;
import case_study.furama_resort_manager.service.IRoomService;
import case_study.furama_resort_manager.util.CheckUtils;
import case_study.furama_resort_manager.util.FormatException;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RoomService implements IRoomService {
    static Scanner scanner=new Scanner(System.in);
    static Map<Room,Integer> roomIntegerMap=new HashMap<>();
    @Override
    public void display() {
        for (Room r :roomIntegerMap.keySet()) {
            System.out.println(r);
        }
    }

    @Override
    public void add() {
        String codeService;
        float usableArea;
        float rentalCosts;
        int peopleMaximum;
        String rentalType;
        String freeService;
        do {
            System.out.println("Enter service code");
            codeService = scanner.nextLine();
        } while (!CheckUtils.checkFacilityCode(codeService));
        do {
            System.out.println("Enter the usable area");
            usableArea = Float.parseFloat(scanner.nextLine());
        }while (!CheckUtils.checkArea(usableArea));
        do {
            System.out.println("Enter rental cost");
            rentalCosts = Float.parseFloat(scanner.nextLine());
        }while (!CheckUtils.checkRentalCost(rentalCosts));
        do {
            System.out.println("Enter the maximum number of people");
            peopleMaximum = Integer.parseInt(scanner.nextLine());
        }while (!CheckUtils.checkPeopleMaximum(peopleMaximum));
        do {
            System.out.println("Enter rental type");
            rentalType = scanner.nextLine();
        }while (!CheckUtils.checkNameService(rentalType));
            System.out.println("Enter the number of floors");
        freeService = scanner.nextLine();
        Room room=new Room(codeService, usableArea, rentalCosts,peopleMaximum,rentalType,freeService);
        roomIntegerMap.put(room,1);
        System.out.println("Successfully added new.");
    }

    @Override
    public void displayMaintenance() {

    }
}
