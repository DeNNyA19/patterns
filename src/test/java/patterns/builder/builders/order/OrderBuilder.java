package patterns.builder.builders.order;

import models.Order;

public abstract class OrderBuilder {

    protected Order order = new Order();

    public Order getOrder() {
        return order;
    }

    public abstract void setShopper();
    public abstract void setCard();
    public abstract void setAddress();

}
