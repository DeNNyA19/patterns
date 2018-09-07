package patterns.iterator.collections;

import models.Booking;
import patterns.iterator.iterators.BookingIterator;

import java.util.List;

public interface IterableCollection {

    BookingIterator createBookingDateIterator(List<Booking> bookings, String date);
    BookingIterator createBookingShopperIterator(List<Booking> bookings, String shopperName);
}
