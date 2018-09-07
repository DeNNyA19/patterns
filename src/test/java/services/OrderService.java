package services;

import models.Booking;
import models.Order;
import models.PurchaseUI;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class OrderService implements OrderInterface {

    protected static final String FULL_NAME_FORMAT = "%s %s %s";

    public Booking makeBooking(Order order) {
        System.out.println("...Service performs booking...For example makes some API call and get id as response");
        String id = generateRandomId();

        Booking booking = new Booking();
        booking.setId(id);
        booking.setShopperName(String.format(FULL_NAME_FORMAT, order.getShopper().getTitle(), order.getShopper().getFirstName(), order.getShopper().getLastName()));
        booking.setPurchasedTime(Calendar.getInstance().getTime());
        return booking;
    }

    public boolean releaseBooking(Booking booking) {
        System.out.println("...Service releases booking...For example makes some API call to reject booking");
        return true;
    }

    private String generateRandomId() {
        String generateFrom = "abcdefghijklmopurstuvwxyz1234567890";
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            Random random = new Random();
            text.append(generateFrom.charAt(random.nextInt((generateFrom.length() - 1 - 0) + 1) + 0));
        }
        return text.toString();
    }
}
