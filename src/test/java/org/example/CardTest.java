package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/card.csv", numLinesToSkip = 1)
    void CardTest(String suitString, String rankString) {
        Suit suit = Suit.valueOf(suitString);
        Rank rank = Rank.valueOf(rankString);

        Card card = new Card(suit, rank);

        assertEquals(suit, card.getSuit());
        assertEquals(rank, card.getRank());
    }

}