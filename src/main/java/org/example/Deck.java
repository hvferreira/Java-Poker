package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Random;

import static java.lang.Integer.compare;

public class Deck {


    private List<Card> cards;
    private Suit[] suits;
    private Rank[] ranks;

    public Deck() {
        cards = new ArrayList<>();

        suits = Suit.getAllSuits();
        ranks = Rank.getAllranks();

        for (Suit s : suits) {
            //System.out.println(s);
            for (Rank r : ranks) {
                cards.add(new Card(s, r));
                System.out.print(r.getSTring() + s + " ");
            }
        }
        shuffle();
        System.out.println();
        playerHand();
        System.out.println(cards.size());
        Comparator<Card> rankComparator = (a, b) -> compare(
                a.getRank().getValue(), b.getRank().getValue());

        for (Card s : cards) {
            System.out.print(s.getRank().getSTring() + "" + s.getSuit() + " ");

        }
        cards.sort(rankComparator);
        System.out.println();
        for (Card s : cards) {
            System.out.print(s.getRank().getSTring() + "" + s.getSuit() + " ");

        }
    }


    public int cardsSize() {
        return cards.size();
    }

    private void shuffle() {

        Random rand = new Random();

        for (int i = 0; i < cardsSize(); i++) {
            // Random for remaining positions.
            int r = i + rand.nextInt(cardsSize() - i);

            //swapping the elements
            Card temp = cards.get(r);
            cards.set(r, cards.get(i));
            cards.set(i, temp);

        }
    }


    public ArrayList<Card> playerHand() {
        ArrayList<Card> hand = new ArrayList<>();

        int i = 0;
        while (i < 5) {
            hand.add(cards.get(0));
            cards.remove(0);
            i++;
        }

        for (Card s : hand) {
            System.out.print(s.getRank().getSTring() + "" + s.getSuit() + " ");

        }
        Comparator<Card> rankComparator = (a, b) -> compare(
                a.getRank().getValue(), b.getRank().getValue());
        hand.sort(rankComparator);
        System.out.println();
        for (Card s : hand) {
            System.out.print(s.getRank().getSTring() + "" + s.getSuit() + " ");

        }
        return hand;
    }
}
