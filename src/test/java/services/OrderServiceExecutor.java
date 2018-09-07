package services;

import models.Order;

public class OrderServiceExecutor {

    public static void executeOrderService(OrderInterface orderInterface, Order order) {
        imitateBookingTimeout();
        orderInterface.makeBooking(order);
    }

    private static void imitateBookingTimeout() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
