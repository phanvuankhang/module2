package case_study.furama_resort_manager.repository.impl;

import case_study.furama_resort_manager.model.booking.Booking;
import case_study.furama_resort_manager.repository.IBookingRepository;
import case_study.furama_resort_manager.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository implements IBookingRepository {
    private static final String PATH_FILE = "src\\case_study\\furama_resort_manager\\data\\booking_data.csv";

    @Override
    public List<Booking> display() {
        List<Booking> bookingList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String string = stringList.get(i);
            String[] arr = string.split(",");
            Booking booking = new Booking(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), arr[3], arr[4], arr[5]);
            bookingList.add(booking);
        }
        return bookingList;
    }

    @Override
    public void add(Booking booking) {
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        stringList.add(booking.getInfoToBooking());
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                ReadAndWrite.writeFile(PATH_FILE, stringList.get(i), false);
            } else {
                ReadAndWrite.writeFile(PATH_FILE, stringList.get(i), true);
            }
        }
    }
}
