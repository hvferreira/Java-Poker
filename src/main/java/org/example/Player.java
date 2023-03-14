package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Player {

    private ArrayList<Card> hand;
    private Ranking ranking;

    public Player() {
        hand = new ArrayList<>();
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }


}
