package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Poker poker = new Poker();
        poker.addPlayer(new Player());
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.S, Rank.TWO));
        hand.add(new Card(Suit.S, Rank.THREE));
        hand.add(new Card(Suit.S, Rank.FOUR));
        hand.add(new Card(Suit.C, Rank.FIVE));
        hand.add(new Card(Suit.S, Rank.SIX));
        poker.getPlayerList().get(0).setHand(hand);


    }
}