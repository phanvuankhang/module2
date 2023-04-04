package case_study.furama_resort_manager.repository;

import case_study.furama_resort_manager.model.facility.Villa;

import java.util.List;
import java.util.Map;

public interface IVillaRepository {
    Map<Villa,Integer> display();
    void add(Villa villa, Integer value);
    Map<Villa, Integer> displayMaintenance();
}
