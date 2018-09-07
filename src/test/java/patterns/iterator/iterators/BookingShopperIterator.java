package patterns.iterator.iterators;

import models.Booking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookingShopperIterator implements BookingIterator {

    private List<Booking> bookings;
    private String shopperName;
    private int currentPosition = 0;

    public BookingShopperIterator(List<Booking> bookings, String shopperName) {
        this.bookings = bookings;
        this.shopperName = shopperName;
    }

    public boolean hasNext() {
        for (int i = currentPosition; i <= bookings.size() - 1; i++) {
            if (bookings.get(currentPosition).getShopperName().equals(shopperName)) {
                return true;
            }
            currentPosition++;
        }
        return false;
    }

    public Booking getNext() {
        if (!hasNext()) {
            System.out.println("No more bookings in list");
            throw new IllegalStateException();
        }
        Booking booking = bookings.get(currentPosition);
        currentPosition++;
        return booking;
    }

    public void remove() {
        bookings.remove(currentPosition);
    }
}
