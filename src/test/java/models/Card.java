package models;

import java.util.Date;

public class Card {

    private String cardNumber;
    private Date expiryDate;
    private String securityNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    public String toString() {
        return String.format("\n     Card number: \"%s\"" +
                "\n     Expiry date: \"%s\"" +
                "\n     Security number: \"%s\"", cardNumber, expiryDate.toString(), securityNumber);
    }
}
