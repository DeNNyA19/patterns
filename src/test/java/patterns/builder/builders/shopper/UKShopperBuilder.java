package patterns.builder.builders.shopper;

import models.Title;

public class UKShopperBuilder extends ShopperBuilder {

    public void setEmail() {
        shopper.setEmail("testukemail@gmail.com");
    }

    public void setTitle() {
        shopper.setTitle(Title.MR);
    }

    public void setFirstName() {
        shopper.setFirstName("Duncan");
    }

    public void setLastName() {
        shopper.setLastName("Smith");
    }

    public void setPhoneNumber() {
        shopper.setPhoneNumber("0121 798 0158");
    }
}
