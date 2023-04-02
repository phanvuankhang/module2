package case_study.furama_resort_manager.service.impl;
import case_study.furama_resort_manager.model.facility.Room;
import case_study.furama_resort_manager.service.IRoomService;

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
        System.out.println("Enter service name");
        String nameService=scanner.nextLine();
        System.out.println("Enter the usable area");
        float usableArea=Float.parseFloat(scanner.nextLine());
        System.out.println("Enter rental cost");
        float rentalCosts=Float.parseFloat(scanner.nextLine());
        System.out.println("Enter the maximum number of people");
        int peopleMaximum=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rental type");
        String rentalType=scanner.nextLine();
        System.out.println("Enter the free service included");
        String freeService=scanner.nextLine();
        Room room=new Room(nameService, usableArea, rentalCosts,peopleMaximum,rentalType,freeService);
        roomIntegerMap.put(room,1);
        System.out.println("Successfully added new.");
    }

    @Override
    public void displayMaintenance() {

    }
}
