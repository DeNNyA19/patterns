package patterns.builder.builders.shopper;

import models.Title;

public class USShopperBuilder extends ShopperBuilder {

    public void setEmail() {
        shopper.setEmail("testusemail@gmail.com");
    }

    public void setTitle() {
        shopper.setTitle(Title.MR);
    }

    public void setFirstName() {
        shopper.setFirstName("John");
    }

    public void setLastName() {
        shopper.setLastName("Brown");
    }

    public void setPhoneNumber() {
        shopper.setPhoneNumber("212 692-9292");
    }
}
