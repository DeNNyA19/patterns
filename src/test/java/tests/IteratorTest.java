package tests;

import models.Booking;
import models.Order;
import patterns.builder.builders.order.UKShopperCorrectOrder;
import patterns.builder.builders.order.UKShopperIncorrectAddress;
import patterns.builder.builders.order.USShopperCorrectOrder;
import patterns.builder.directors.OrderDirector;
import patterns.iterator.collections.BookingCollection;
import patterns.iterator.iterators.BookingIterator;
import patterns.proxy.OrderServiceWithSavingToPool;
import patterns.singleton.BookingPool;

import java.util.List;

public class IteratorTest {

    private static final String UK_SHOPPER = "MR Duncan Smith";
    private static final String US_SHOPPER = "MR John Brown";

    public static void main(String[] args) {
        Order correctUKOrder = new OrderDirector().formOrder(new UKShopperCorrectOrder());
        Order correctUSOrder = new OrderDirector().formOrder(new USShopperCorrectOrder());
        Order incorrectUKOrder = new OrderDirector().formOrder(new UKShopperIncorrectAddress());

        OrderServiceWithSavingToPool orderServiceWithSavingToPool = new OrderServiceWithSavingToPool();
        orderServiceWithSavingToPool.makeBooking(correctUKOrder);
        orderServiceWithSavingToPool.makeBooking(correctUSOrder);
        orderServiceWithSavingToPool.makeBooking(incorrectUKOrder);


        List<Booking> bookings = BookingPool.getInstance().getAllBookings();

        System.out.println("\nPrint bookings with date \"2018-09-04\"");
        BookingIterator bookingDateIterator = new BookingCollection().createBookingDateIterator(bookings, "2018-09-04");
        while (bookingDateIterator.hasNext()) {
            System.out.println(bookingDateIterator.getNext().toString());
        }

        System.out.println(String.format("\nPrint bookings with shopper \"%s\"", US_SHOPPER));
        BookingIterator bookingShopperIterator = new BookingCollection().createBookingShopperIterator(bookings, US_SHOPPER);
        while (bookingShopperIterator.hasNext()) {
            System.out.println(bookingShopperIterator.getNext().toString());
        }
    }
}
