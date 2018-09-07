package patterns.builder.directors;

import patterns.builder.builders.card.CardBuilder;
import models.Card;

public class CardDirector {

    public Card formCard(CardBuilder cardBuilder) {
        cardBuilder.setCardNumber();
        cardBuilder.setExpiryDate();
        cardBuilder.setSecurityNumber();
        return cardBuilder.getCard();
    }

    public Card formCardWithoutSecurityNumber(CardBuilder cardBuilder) {
        cardBuilder.setCardNumber();
        cardBuilder.setExpiryDate();
        return cardBuilder.getCard();
    }
}
