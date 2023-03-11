package org.example;

import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private Ranking ranking;

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    public Player() {
        hand = new ArrayList<>();
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

}
