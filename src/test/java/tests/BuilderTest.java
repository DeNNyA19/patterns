package tests;

import patterns.builder.builders.order.UKShopperCorrectOrder;
import patterns.builder.builders.order.UKShopperIncorrectAddress;
import patterns.builder.builders.order.USShopperCorrectOrder;
import patterns.builder.directors.OrderDirector;
import models.Order;

public class BuilderTest {

    public static void main(String[] args) {
        Order correctUKOrder = new OrderDirector().formOrder(new UKShopperCorrectOrder());
        System.out.println(correctUKOrder);
    }
}
