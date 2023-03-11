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
        hand.add(new Card(Suit.S, Rank.THREE));
        hand.add(new Card(Suit.C, Rank.ACE));
        hand.add(new Card(Suit.D, Rank.TWO));
        hand.add(new Card(Suit.H, Rank.TWO));
        hand.add(new Card(Suit.S, Rank.TWO));
        poker.getPlayerList().get(0).setHand(hand);


        //assertFalse(poker.straightFlush(0));
        //assertFalse(poker.fourOfaKind(0));
        //assertFalse(poker.fourOfaKind(0));
        assertFalse(poker.fullHouse(0));
    }

    @Test
    void straightFlush() {
    }
}