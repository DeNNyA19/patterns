package patterns.iterator.iterators;

import models.Booking;
import models.Item;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class BookingDateIterator implements BookingIterator {

    private List<Booking> bookings;
    private String date;
    private int currentPosition = 0;

    public BookingDateIterator(List<Booking> bookings, String date) {
        this.date = date;
        this.bookings = bookings;
    }

    public boolean hasNext() {
        for (int i = currentPosition; i <= bookings.size() - 1; i++) {
            if (bookings.get(currentPosition).getPurchasedTime().split(" ")[0].equals(date)) {
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
