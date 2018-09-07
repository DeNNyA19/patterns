package tests;

import models.Order;
import patterns.builder.builders.order.UKShopperCorrectOrder;
import patterns.builder.builders.order.UKShopperIncorrectAddress;
import patterns.builder.builders.order.USShopperCorrectOrder;
import patterns.builder.directors.OrderDirector;
import patterns.proxy.OrderServiceWithSavingToPool;
import patterns.singleton.BookingPool;
import services.OrderService;
import services.OrderServiceExecutor;

public class ProxyTest {

    public static void main(String[] args) {
        Order correctUKOrder = new OrderDirector().formOrder(new UKShopperCorrectOrder());
        Order correctUSOrder = new OrderDirector().formOrder(new USShopperCorrectOrder());
        Order incorrectUKOrder = new OrderDirector().formOrder(new UKShopperIncorrectAddress());

        OrderServiceExecutor.executeOrderService(new OrderService(), correctUKOrder);
        OrderServiceExecutor.executeOrderService(new OrderServiceWithSavingToPool(), correctUKOrder);
        OrderServiceExecutor.executeOrderService(new OrderServiceWithSavingToPool(), correctUSOrder);
        OrderServiceExecutor.executeOrderService(new OrderServiceWithSavingToPool(), incorrectUKOrder);

        System.out.println("\n");
        BookingPool.getInstance().printAllBookings();
        postCondition();
    }

    private static void postCondition() {
        BookingPool.getInstance().releaseAllBookings();
        System.out.println("\n");
        BookingPool.getInstance().printAllBookings();
    }


}
