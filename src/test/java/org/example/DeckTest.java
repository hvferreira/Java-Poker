package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {


    @Test
    void testCardsSize() {
        Deck deck = new Deck();

        assertEquals(52, deck.cardsSize());
        deck.playerHand();
        assertEquals(47, deck.cardsSize());
        deck.playerHand();
        assertEquals(42, deck.cardsSize());
    }

    @Test
    void playerHand() {
        Deck deck = new Deck();

        assertEquals(5, deck.playerHand().size());

    }
}