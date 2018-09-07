package patterns.builder.directors;

import patterns.builder.builders.shopper.ShopperBuilder;
import models.Shopper;

public class ShopperDirector {

    public Shopper formShopper(ShopperBuilder shopperBuilder) {
        shopperBuilder.setEmail();
        shopperBuilder.setTitle();
        shopperBuilder.setFirstName();
        shopperBuilder.setLastName();
        shopperBuilder.setPhoneNumber();
        return shopperBuilder.getShopper();
    }

    public Shopper formShopperWithoutEmail(ShopperBuilder shopperBuilder) {
        shopperBuilder.setTitle();
        shopperBuilder.setFirstName();
        shopperBuilder.setLastName();
        shopperBuilder.setPhoneNumber();
        return shopperBuilder.getShopper();
    }

    public Shopper formShopperWithoutEmailAndPhoneNumber(ShopperBuilder shopperBuilder) {
        shopperBuilder.setTitle();
        shopperBuilder.setFirstName();
        shopperBuilder.setLastName();
        return shopperBuilder.getShopper();
    }
}
