package patterns.builder.builders.order;

import patterns.builder.builders.address.UKAddressBuilder;
import patterns.builder.builders.card.UKCardBuilder;
import patterns.builder.builders.shopper.UKShopperBuilder;
import patterns.builder.directors.AddressDirector;
import patterns.builder.directors.CardDirector;
import patterns.builder.directors.ShopperDirector;

public class UKShopperCorrectOrder extends OrderBuilder {

    public void setShopper() {
        order.setShopper(new ShopperDirector().formShopper(new UKShopperBuilder()));
    }

    public void setCard() {
        order.setCard(new CardDirector().formCard(new UKCardBuilder()));
    }

    public void setAddress() {
        order.setAddress(new AddressDirector().formFullAddress(new UKAddressBuilder()));
    }
}
