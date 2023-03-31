package case_study.furama_resort_manager.service;

public interface IBookingService extends IService {
    void edit();
    void create();

    @Override
    void display();

    @Override
    void add();
}

