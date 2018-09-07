package models;

public class Order {

    private Shopper shopper;
    private Card card;
    private Address address;

    public Shopper getShopper() {
        return shopper;
    }

    public void setShopper(Shopper shopper) {
        this.shopper = shopper;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return String.format("Order is:\n " +
                "   Shopper: %s;\n" +
                "   Card: %s\n" +
                "   Address: %s\n", shopper.toString(), card.toString(), address.toString());
    }
}
