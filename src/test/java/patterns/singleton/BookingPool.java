package patterns.singleton;

import models.Booking;
import services.OrderService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookingPool {

    private static BookingPool instance;
    private ArrayList<Booking> bookingPool;

    private BookingPool() {
        bookingPool = new ArrayList<>();
    }

    public static BookingPool getInstance() {
        synchronized (BookingPool.class) {
            if (instance == null) {
                instance = new BookingPool();
            }
        }
        return instance;
    }

    public void addBooking(Booking booking) {
        System.out.println(String.format("Adding booking with id '%s' to pool...", booking.getId()));
        bookingPool.add(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingPool;
    }

    public void releaseAllBookings() {
        OrderService orderService = new OrderService();
        Iterator iterator = bookingPool.iterator();
        while (iterator.hasNext()) {
            Booking booking = (Booking) iterator.next();
            if (orderService.releaseBooking(booking)) {
                iterator.remove();
            } else {
                System.out.println(String.format("Booking with id '%s' wasn't removed due to some reason", booking.getId()));
            }
        }
    }

    public void printAllBookings() {
        if (bookingPool.size() == 0) {
            System.out.println("Booking pool is empty");
        }
        for (Booking booking : bookingPool) {
            System.out.println(booking);
        }
    }
}
