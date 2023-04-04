package case_study.furama_resort_manager.repository;

import case_study.furama_resort_manager.model.facility.Room;

import java.util.List;
import java.util.Map;

public interface IRoomRepository {
    Map<Room, Integer> display();

    void add(Room room, Integer value);

    Map<Room, Integer> displayMaintenance();
}
