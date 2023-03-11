package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void cardsSize() {
        Deck deck = new Deck();
        assertEquals(52, deck.cardsSize());
    }
}