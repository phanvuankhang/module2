package case_study.furama_resort_manager.repository;

import case_study.furama_resort_manager.model.booking.Booking;

import java.util.List;

public interface IBookingRepository {
    List<Booking> display();
    void add(Booking booking);
}
