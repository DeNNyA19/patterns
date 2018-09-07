package patterns.builder.builders.order;

import patterns.builder.builders.address.UKAddressBuilder;
import patterns.builder.builders.address.USAddressBuilder;
import patterns.builder.builders.card.UKCardBuilder;
import patterns.builder.builders.card.USCardBuilder;
import patterns.builder.builders.shopper.UKShopperBuilder;
import patterns.builder.builders.shopper.USShopperBuilder;
import patterns.builder.directors.AddressDirector;
import patterns.builder.directors.CardDirector;
import patterns.builder.directors.ShopperDirector;

public class USShopperCorrectOrder extends OrderBuilder {

    public void setShopper() {
        order.setShopper(new ShopperDirector().formShopper(new USShopperBuilder()));
    }

    public void setCard() {
        order.setCard(new CardDirector().formCard(new USCardBuilder()));
    }

    public void setAddress() {
        order.setAddress(new AddressDirector().formFullAddress(new USAddressBuilder()));
    }
}
