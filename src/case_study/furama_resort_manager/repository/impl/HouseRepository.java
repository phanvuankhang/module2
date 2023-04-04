package case_study.furama_resort_manager.repository.impl;

import case_study.furama_resort_manager.model.facility.House;
import case_study.furama_resort_manager.model.facility.Villa;
import case_study.furama_resort_manager.repository.IHouseRepository;
import case_study.furama_resort_manager.util.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HouseRepository implements IHouseRepository {
    private static final String PATH_FILE = "src\\case_study\\furama_resort_manager\\data\\house_data.csv";

    @Override
    public Map<House, Integer> display() {
        Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String string = stringList.get(i);
            String[] arr = string.split(",");
            House house = new House(arr[0], Float.parseFloat(arr[1]), Float.parseFloat(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]));
            houseIntegerMap.put(house, 0);
        }
        return houseIntegerMap;
    }

    @Override
    public void add(House house, Integer value) {
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        String string = house.getInfoToHouse();
        stringList.add(string + "," + value);
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                ReadAndWrite.writeFile(PATH_FILE, stringList.get(i), false);
            } else {
                ReadAndWrite.writeFile(PATH_FILE, stringList.get(i), true);
            }
        }
    }

    @Override
    public Map<House, Integer> displayMaintenance() {
        return null;
    }


}
