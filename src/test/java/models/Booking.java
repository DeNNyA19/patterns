package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Booking {

    private static final String PURCHASED_TIME_FORMAT = "yyyy-MM-dd hh:mm:ss";
    private String id;
    private String shopperName;
    private String purchasedTime;
    private List<Item> items = new ArrayList<Item>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopperName() {
        return shopperName;
    }

    public void setShopperName(String shopperName) {
        this.shopperName = shopperName;
    }

    public String getPurchasedTime() {
        return purchasedTime;
    }

    public void setPurchasedTime(Date purchasedTime) {
        this.purchasedTime = new SimpleDateFormat(PURCHASED_TIME_FORMAT).format(purchasedTime);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String toString() {
        return String.format("Booking with id '%s' and purchased time '%s'", id, purchasedTime);
    }
}
