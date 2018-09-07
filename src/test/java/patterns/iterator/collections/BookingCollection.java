package patterns.iterator.collections;

import models.Booking;
import patterns.iterator.iterators.BookingDateIterator;
import patterns.iterator.iterators.BookingIterator;
import patterns.iterator.iterators.BookingShopperIterator;

import java.util.List;

public class BookingCollection implements IterableCollection {

    public BookingIterator createBookingDateIterator(List<Booking> bookings, String date) {
        return new BookingDateIterator(bookings, date);
    }

    public BookingIterator createBookingShopperIterator(List<Booking> bookings, String shopperName) {
        return new BookingShopperIterator(bookings, shopperName);
    }
}
