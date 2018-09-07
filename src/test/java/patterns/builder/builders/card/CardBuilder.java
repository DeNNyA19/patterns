package patterns.builder.builders.card;

import models.Card;

public abstract class CardBuilder {

    protected Card card = new Card();

    public Card getCard() {
        return card;
    }

    public abstract void setCardNumber();
    public abstract void setExpiryDate();
    public abstract void setSecurityNumber();
}
