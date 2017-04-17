package com.edu.cnu.poker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by ghu33 on 2017-04-17.
 */
public class DeckTest {
    @Test
    public void Deck4개의_총카드수는_208(){
        Deck deck = new Deck(4);
        int result = deck.getTotalCard();
        assertThat(result, is(208));
    }
    @Test
    public void Deck5개의_총카드수는_260(){
        Deck deck = new Deck(5);
        int result = deck.getTotalCard();
        assertThat(result, is(260));
    }

    @Test
    public void 싱글덱에서_카드를_한장뽑으면_51장이남는다(){
        Deck deck = new Deck(1);
        deck.drawCard();
        assertThat(deck.getTotalCard(),is(51));
    }

    @Test(expected = NoMoreCardException.class)
    public void 카드가_없으면_에러발생(){
        Deck deck = new Deck(1);
        for(int i = 0; i < 52; i ++)
            deck.drawCard();
        deck.drawCard();
    }

    @Test
    public void
}