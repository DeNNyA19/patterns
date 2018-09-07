package patterns.builder.directors;

import patterns.builder.builders.order.OrderBuilder;
import models.Order;

public class OrderDirector {

    public Order formOrder(OrderBuilder orderBuilder) {
        orderBuilder.setAddress();
        orderBuilder.setCard();
        orderBuilder.setShopper();
        return orderBuilder.getOrder();
    }

    public Order formOrderWithoutAddress(OrderBuilder orderBuilder) {
        orderBuilder.setCard();
        orderBuilder.setShopper();
        return orderBuilder.getOrder();
    }
}
