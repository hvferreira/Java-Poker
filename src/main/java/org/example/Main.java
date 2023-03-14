package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.addPlayer(new Player());
        poker.addPlayer(new Player());
        poker.getPlayerList().get(0).setHand(poker.getDeck().playerHand());
        poker.getPlayerList().get(1).setHand(poker.getDeck().playerHand());
        poker.table();
        System.out.println("The winner is " + poker.playerWin());
    }
}