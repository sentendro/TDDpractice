package com.edu.cnu.poker;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by ghu33 on 2017-04-17.
 */
@Data
public class Card {
    private int rank;
    private SUIT suit;

    public Card(int rank, SUIT suit) {
        this.rank = rank;
        this.suit = suit;

        if(rank > 13){
            throw new NoSuchRankException();
        }
    }
}
