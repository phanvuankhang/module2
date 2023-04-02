package case_study.furama_resort_manager.service.impl;


import case_study.furama_resort_manager.model.facility.Villa;
import case_study.furama_resort_manager.service.IVillaService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VillaService implements IVillaService {
    static Scanner scanner=new Scanner(System.in);
    static Map<Villa,Integer> villaIntegerMap=new HashMap<>();
    @Override
    public void display() {
        for (Villa v : villaIntegerMap.keySet()) {
            System.out.println(v);
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
        System.out.println("Enter room standard");
        String roomStandard=scanner.nextLine();
        System.out.println("Enter the pool area");
        float poolArea=Float.parseFloat(scanner.nextLine());
        System.out.println("Enter the number of floors");
        int floorsNumber=Integer.parseInt(scanner.nextLine());
        Villa villa=new Villa(nameService, usableArea, rentalCosts,peopleMaximum,rentalType,roomStandard,poolArea,floorsNumber);
        villaIntegerMap.put(villa,1);
        System.out.println("Successfully added new.");
    }

    @Override
    public void displayMaintenance() {

    }
}
