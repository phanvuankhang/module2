package case_study.furama_resort_manager.service.impl;

import case_study.furama_resort_manager.model.facility.House;
import case_study.furama_resort_manager.service.IHouseService;
import case_study.furama_resort_manager.util.CheckUtils;
import case_study.furama_resort_manager.util.FormatException;

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
        String codeService;
        float usableArea;
        float rentalCosts;
        int peopleMaximum;
        String rentalType;
        String roomStandard;
        int floorsNumber;
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
        do {
            System.out.println("Enter room standard");
            roomStandard = scanner.nextLine();
        }while (!CheckUtils.checkNameService(roomStandard));
        do {
            System.out.println("Enter the number of floors");
            floorsNumber = Integer.parseInt(scanner.nextLine());
        }while (!CheckUtils.checkFloorsNumber(floorsNumber));
        House house=new House(codeService, usableArea, rentalCosts,peopleMaximum,rentalType,roomStandard,floorsNumber);
        houseIntegerMap.put(house,1);
        System.out.println("Successfully added new.");
    }

    @Override
    public void displayMaintenance() {
        boolean flag=true;
        for (Integer h:houseIntegerMap.values()) {
            if (h > 5) {
                System.out.println("Technical team to check and maintain equipment: "+houseIntegerMap.values());
                flag=false;
            }
        }
    }
}
