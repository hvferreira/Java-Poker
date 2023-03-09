package org.example;

public class Deck {

    public Deck (){
        Suit[] suits = Suit.getAllSuits();
        Rank[] ranks = Rank.getAllranks();
        for (Suit s:suits) {
            System.out.println(s);

        }

        for (Rank r:ranks) {
            System.out.println(r.getSTring());

        }

    }
}
