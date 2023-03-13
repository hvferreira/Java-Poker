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

    public Player playerWin() {

        if (playerList.get(0).getRanking().getValue() == playerList.get(1).getRanking().getValue()) {
            System.out.println("ARE EQUAL");
        } else {
            if (playerList.get(0).getRanking().getValue() < playerList.get(1).getRanking().getValue()) {
                return playerList.get(0);
            } else {
                return playerList.get(1);
            }
        }

        return null;
    }

    public void table() {

        for (int i = 0; i < playerList.size(); i++) {

            if (straightFlush(0)) {
                playerList.get(i).setRanking(Ranking.Straightflush);

            } else if (fourOfaKind(0)) {
                playerList.get(i).setRanking(Ranking.Fourofakind);

            } else if (fullHouse(0)) {
                playerList.get(i).setRanking(Ranking.FullHouse);

            } else if (flush(0)) {
                playerList.get(i).setRanking(Ranking.Flush);

            } else if (straight(0)) {
                playerList.get(i).setRanking(Ranking.Straight);

            } else if (threeOfAKind(0)) {
                playerList.get(i).setRanking(Ranking.ThreeofaKind);

            } else if (twoPair(0)) {
                playerList.get(i).setRanking(Ranking.TwoPairs);

            } else if (onePair(0)) {
                System.out.println("ONE Pair");
                playerList.get(i).setRanking(Ranking.OnePair);

            } else {
                playerList.get(i).setRanking(Ranking.HighCard);
            }
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

            return true;
        }
        return false;
    }

    public boolean fullHouse(int i) {
        if ((playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(0).getRank()).collect(Collectors.toList()).size() == 2 && playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(3).getRank()).collect(Collectors.toList()).size() == 3) ||
                (playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(0).getRank()).collect(Collectors.toList()).size() == 3 && playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(3).getRank()).collect(Collectors.toList()).size() == 2)) {
            return true;
        }
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

        int k = 0;
        while (k < 3) {
            if (playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(1).getRank()).collect(Collectors.toList()).size() == 3 ||
                    playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(3).getRank()).collect(Collectors.toList()).size() == 3) {
                return true;
            }
            k++;
        }
        return false;
    }


    public boolean twoPair(int i) {
        int k = 0;
        while (k < 3) {
            if (playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(1).getRank()).collect(Collectors.toList()).size() == 2 &&
                    playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(3).getRank()).collect(Collectors.toList()).size() == 2) {

                return true;
            }
            k++;
        }
        return false;
    }

    public boolean onePair(int i) {
        int k = 0;
        while (k < 3) {
            if (playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(1).getRank()).collect(Collectors.toList()).size() == 2 ||
                    playerList.get(i).getHand().stream().filter(a -> a.getRank() == playerList.get(i).getHand().get(3).getRank()).collect(Collectors.toList()).size() == 2) {

                return true;
            }
            k++;
        }
        return false;

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
