package patterns.builder.builders.card;

import patterns.builder.Constants;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class IncorrectCardBuilder extends CardBuilder {

    public void setCardNumber() {
        card.setCardNumber("4444 3333 2222 11111");
    }

    public void setExpiryDate() {
        try {
            card.setExpiryDate(new SimpleDateFormat(Constants.EXPIRY_DATE_FORMAT).parse("12/2017"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void setSecurityNumber() {
        card.setSecurityNumber("001");
    }
}
