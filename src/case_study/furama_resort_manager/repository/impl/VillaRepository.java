package case_study.furama_resort_manager.repository.impl;

import case_study.furama_resort_manager.model.facility.Villa;
import case_study.furama_resort_manager.repository.IVillaRepository;
import case_study.furama_resort_manager.util.ReadAndWrite;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VillaRepository implements IVillaRepository {
    private static final String PATH_FILE = "src\\case_study\\furama_resort_manager\\data\\villa_data.csv";

    @Override
    public Map<Villa, Integer> display() {
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String string = stringList.get(i);
            String[] arr = string.split(",");
            Villa villa = new Villa(arr[0], Float.parseFloat(arr[1]), Float.parseFloat(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Float.parseFloat(arr[6]), Integer.parseInt(arr[7]));
            villaIntegerMap.put(villa, 0);
        }
        return villaIntegerMap;
    }

    @Override
    public void add(Villa villa, Integer value) {
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        String string = villa.getInfoToVilla();
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
    public Map<Villa, Integer> displayMaintenance() {
        return null;
    }
}
