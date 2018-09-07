package patterns.adapter;

import models.Address;
import models.Order;
import models.PurchaseUI;
import models.Shopper;

public class OrderAdapter extends PurchaseUI {

    private Order order;

    public OrderAdapter(Order order) {
        this.order = order;
    }

    public String getFullName() {
        Shopper shopper = order.getShopper();
        return String.format(FULL_NAME_FORMAT, shopper.getTitle(), shopper.getFirstName(), shopper.getLastName());
    }

    @Override
    public String getFullAddress() {
        Address address = order.getAddress();
        return String.format(FULL_ADDRESS_FORMAT, address.getAddressLine(), address.getCity(), address.getPostcode(), address.getCountry());
    }

    @Override
    public String getContactInfo() {
        Shopper shopper = order.getShopper();
        return String.format(CONTACT_INFO_FORMAT, shopper.getEmail(), shopper.getPhoneNumber());
    }
}
