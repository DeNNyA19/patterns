package patterns.proxy;

import models.Booking;
import models.Order;
import patterns.singleton.BookingPool;
import services.OrderInterface;
import services.OrderService;

public class OrderServiceWithSavingToPool implements OrderInterface {

    private OrderService orderService;

    public OrderServiceWithSavingToPool() {
        orderService = new OrderService();
    }

    public Booking makeBooking(Order order) {
        Booking booking = orderService.makeBooking(order);
        BookingPool.getInstance().addBooking(booking);
        return booking;
    }
}
