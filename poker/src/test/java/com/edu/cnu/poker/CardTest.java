package com.edu.cnu.poker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by ghu33 on 2017-04-17.
 */
public class CardTest {
    @Test
    public void 카드_5_다이아몬드_생성(){
        Card card = new Card(5, SUIT.DIAMONDS);
        assertThat(card.getRank(), is(5));
        assertThat(card.getSuit(), is(SUIT.DIAMONDS));
    }

    @Test(expected = NoSuchRankException.class)
    public void 카드의_랭크는_13이하여야한다(){
        Card card = new Card(14,SUIT.CLOVERS);
    }
}