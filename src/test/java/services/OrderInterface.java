package services;

import models.Booking;
import models.Order;

public interface OrderInterface {

    Booking makeBooking(Order order);
}
