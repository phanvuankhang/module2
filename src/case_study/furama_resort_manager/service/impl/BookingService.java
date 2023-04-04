package case_study.furama_resort_manager.service.impl;

import case_study.furama_resort_manager.model.booking.Booking;
import case_study.furama_resort_manager.repository.IBookingRepository;
import case_study.furama_resort_manager.repository.impl.BookingRepository;
import case_study.furama_resort_manager.service.IBookingService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingService implements IBookingService {
    static Scanner scanner = new Scanner(System.in);
    static List<Booking> bookingList = new ArrayList<>();
    static IBookingRepository bookingRepository = new BookingRepository();

    @Override
    public void display() {
        bookingList = bookingRepository.display();
        for (Booking b : bookingList) {
            System.out.println(b);
        }
    }

    @Override
    public void add() {
        System.out.print("Enter booking code: ");
        String bookingCode = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < bookingList.size(); i++) {
            if (bookingList.get(i).getBookingCode().equals(bookingCode)) {
                System.out.println("Booking code already exists!");
                return;
            } else {
                count++;
            }
        }
        System.out.print("Enter start date: ");
        int startDay = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter end date: ");
        int endDay = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter customer code: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter service name: ");
        String nameService = scanner.nextLine();
        System.out.print("Enter service type: ");
        String typeService = scanner.nextLine();
        Booking booking = new Booking(bookingCode, startDay, endDay, customerId, nameService, typeService);
        bookingList.add(booking);
        bookingRepository.add(booking);
        System.out.println("Successfully added new.");
    }
}