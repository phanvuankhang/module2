package case_study.furama_resort_manager.service.impl;

import case_study.furama_resort_manager.model.facility.House;
import case_study.furama_resort_manager.service.IHouseService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HouseService implements IHouseService {
    static Scanner scanner=new Scanner(System.in);
    static Map<House,Integer> houseIntegerMap =new LinkedHashMap<>();
    @Override
    public void display() {
        for (House h : houseIntegerMap.keySet()) {
            System.out.println(h);
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
        System.out.println("Enter the number of floors");
        int floorsNumber=Integer.parseInt(scanner.nextLine());
        House house=new House(nameService, usableArea, rentalCosts,peopleMaximum,rentalType,roomStandard,floorsNumber);
        houseIntegerMap.put(house,1);
        System.out.println("Successfully added new.");
    }

    @Override
    public void displayMaintenance() {

    }
}
