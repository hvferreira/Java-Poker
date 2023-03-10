package org.example;

import java.util.ArrayList;

public class Deck {


    ArrayList<Card> cards;

    public Deck (){
        cards = new ArrayList<>();
        Suit[] suits = Suit.getAllSuits();
        Rank[] ranks = Rank.getAllranks();

        for (Suit s:suits) {
            //System.out.println(s);
            for (Rank r:ranks) {

                System.out.println(r.getSTring());

            }
        }


        System.out.println(r.getSTring());
    }
}
