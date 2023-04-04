package case_study.furama_resort_manager.repository;

import case_study.furama_resort_manager.model.facility.House;

import java.util.Map;

public interface IHouseRepository {
    Map<House, Integer> display();
    void add(House house, Integer value);
    Map<House, Integer> displayMaintenance();
}

