package tests;

import models.Order;
import models.PurchaseUI;
import patterns.adapter.OrderAdapter;
import patterns.builder.builders.order.UKShopperIncorrectAddress;
import patterns.builder.directors.OrderDirector;

public class AdapterTest {

    /**
     * Methods forms PurchaseUI object from UI representation of website
     */
    private static PurchaseUI getPurchaseObjectFromUI() {
        PurchaseUI purchaseUI = new PurchaseUI();
        purchaseUI.setFullName("MR Duncan Smith");
        purchaseUI.setFullAddress("583 NW. Del Monte Street Jamestown,\n New-York,\n 10001,\n US");
        purchaseUI.setContactInfo("Email: testukemail@gmail.com, Telephone: 0121 798 0158");
        return purchaseUI;
    }


    public static void main(String[] args) {
        Order correctUKOrder = new OrderDirector().formOrder(new UKShopperIncorrectAddress());
        OrderAdapter orderAdapter = new OrderAdapter(correctUKOrder);

        System.out.println("Are object equal: " + orderAdapter.equals(getPurchaseObjectFromUI()));
    }
}
