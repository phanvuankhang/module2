package case_study.furama_resort_manager.service;

public interface IVillaService extends IFacilityService {
    @Override
    void display();

    @Override
    void add();

    @Override
    void displayMaintenance();
}
