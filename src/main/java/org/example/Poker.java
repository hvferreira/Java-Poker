package org.example;

import java.util.Collections;
import java.util.List;

public class Poker {

    private Deck deck;

    private List<Player> playerList;
    private Suit[] suits;
    private Rank[] ranks;

    public Poker() {
        deck = new Deck();
        //player1 = new Player();
        //player2 = new Player();

        suits = Suit.getAllSuits();
        ranks = Rank.getAllranks();
    }

}
