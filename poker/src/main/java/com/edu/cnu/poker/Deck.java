package com.edu.cnu.poker;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ghu33 on 2017-04-17.
 */
@Data
public class Deck {

    private int numberOfDeck;
    private List<Card> cardList;

    public Deck(int decks) {
        this.numberOfDeck = decks;
        this.cardList = new ArrayList<Card>();
        createCard(decks);
    }

    private void createCard(int numberOfDeck) {
        for(int j = 0; j < numberOfDeck; j++) {
            for (SUIT suit : SUIT.values()) {
                for (int i = 1; i < 14; i++) {
                    Card card = new Card(i, suit);
                    cardList.add(card);
                }
            }
        }
    }

    public int getTotalCard() {
        return this.cardList.size();
    }

    public Card drawCard() {
        if(!this.cardList.isEmpty())
            return this.cardList.remove(0);
        throw new NoMoreCardException();
    }
}
