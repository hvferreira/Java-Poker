package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Poker {

    private Deck deck;

    private List<Player> playerList;
    private Suit[] suits;


    private Rank[] ranks;


    public Poker() {
        deck = new Deck();
        suits = Suit.getAllSuits();
        ranks = Rank.getAllranks();
        playerList = new ArrayList<>();
        //for (Rank s :ranks) {
          //  System.out.println(s.getSTring().equals());

        //}
    }

    public Deck getDeck() {
        return deck;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public void table() {

        if (straightFlush(0)) {

        } else if (fourOfaKind(0)) {

        }else if (fullHouse(0)) {

        }
        else if (flush(0)) {

        } else if (straight(0)) {

        }
        else if (threeOfAKind(0)) {

        }
    }




    public boolean straightFlush(int i) {
        if (5 != suitsNumCardsHand(i))
            return false;
        else {
            return numbSequecial(i);
        }
    }

    public boolean fourOfaKind(int i) {
        if (playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(0).getRank()).collect(Collectors.toList()).size() == 4 ||
                playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(1).getRank()).collect(Collectors.toList()).size() == 4) {
            System.out.println("true 4");
            return true;
        }
        System.out.println("false 4");
        return false;
    }

    public boolean fullHouse(int i) {
        if ((playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(0).getRank()).collect(Collectors.toList()).size() == 2 && playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(3).getRank()).collect(Collectors.toList()).size() == 3) ||
                (playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(0).getRank()).collect(Collectors.toList()).size() == 3 && playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(3).getRank()).collect(Collectors.toList()).size() == 2)) {
            System.out.println("true fullHouse");
            return true;
        }
        System.out.println("false FullHouse");
        return false;
    }

    public boolean flush(int i) {
        if (5 == suitsNumCardsHand(i))
            return true;
        return false;
    }

    public boolean straight(int i) {
        return numbSequecial(i);
    }

    public boolean threeOfAKind(int i) {
    }

    private int suitsNumCardsHand(int i) {
        return playerList.get(i).getHand().stream().filter(a -> a.getSuit() == playerList.get(i).getHand().get(0).getSuit()).collect(Collectors.toList()).size();
    }

    private boolean numbSequecial(int i) {
        int k = 1;
        while (k < playerList.get(i).getHand().size()) {
            if (!(playerList.get(i).getHand().get(k - 1).getRank().getValue() + 1 == playerList.get(i).getHand().get(k).getRank().getValue())) {
                k = playerList.get(i).getHand().size();
                System.out.println("while in false");
                return false;
            }
            k++;
        }
        System.out.println("while out true");
        return true;
    }
}
