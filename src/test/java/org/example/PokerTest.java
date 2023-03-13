package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PokerTest {

    @Test
    void table() {
        Poker poker = new Poker();
        poker.addPlayer(new Player());
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.S, Rank.JACK));
        hand.add(new Card(Suit.C, Rank.JACK));
        hand.add(new Card(Suit.D, Rank.KING));
        hand.add(new Card(Suit.H, Rank.QUEEN));
        hand.add(new Card(Suit.S, Rank.TWO));
        poker.getPlayerList().get(0).setHand(hand);


        //assertFalse(poker.straightFlush(0));
        //assertFalse(poker.fourOfaKind(0));
        //assertFalse(poker.fourOfaKind(0));
        //assertFalse(poker.fullHouse(0));
        //assertFalse(poker.threeOfAKind(0));
        //assertFalse(poker.twpPair(0));
        //assertFalse(poker.onePair(0));
        poker.table();
    }

    @Test
    void straightFlush() {
    }
}