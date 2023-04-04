package case_study.furama_resort_manager.repository.impl;

import case_study.furama_resort_manager.model.facility.House;
import case_study.furama_resort_manager.model.facility.Room;
import case_study.furama_resort_manager.repository.IRoomRepository;
import case_study.furama_resort_manager.util.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RoomRepository implements IRoomRepository {
    private static final String PATH_FILE = "src\\case_study\\furama_resort_manager\\data\\room_data.csv";

    @Override
    public Map<Room, Integer> display() {
        Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String string = stringList.get(i);
            String[] arr = string.split(",");
            Room room = new Room(arr[0], Float.parseFloat(arr[1]), Float.parseFloat(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5]);
            roomIntegerMap.put(room, 0);
        }
        return roomIntegerMap;
    }

    @Override
    public void add(Room room, Integer value) {
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        String string = room.getInfoToRoom();
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
    public Map<Room, Integer> displayMaintenance() {
        return null;
    }
}
