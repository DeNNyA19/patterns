package patterns.builder.builders.shopper;

import models.Shopper;

public abstract class ShopperBuilder {

    protected Shopper shopper = new Shopper();

    public Shopper getShopper() {
        return shopper;
    }

    public abstract void setEmail();
    public abstract void setTitle();
    public abstract void setFirstName();
    public abstract void setLastName();
    public abstract void setPhoneNumber();
}
