package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;

import static java.lang.Integer.compare;

public class Deck {

    private ArrayList<Card> cards;
    private Suit[] suits;
    private Rank[] ranks;

    public Deck() {
        cards = new ArrayList<>();
        suits = Suit.getAllSuits();
        ranks = Rank.getAllranks();

        for (Suit s : suits) {
            for (Rank r : ranks) {
                cards.add(new Card(s, r));
                //System.out.print(r.getSTring() + s + " ");
            }
        }
        //Comparator<Card> rankComparator = (a, b) -> compare(a.getRank().getValue(), b.getRank().getValue());
        //List<Card> cardsSorted = cards.stream().sorted(Comparator.comparing(cards -> cards.getRank().getValue())).collect(Collectors.toList());
        shuffle();
    }


    public int cardsSize() {
        return cards.size();
    }

    private void shuffle() {

        Random rand = new Random();

        for (int i = 0; i < cardsSize(); i++) {
            int r = i + rand.nextInt(cardsSize() - i);

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
        return new ArrayList(hand.stream().sorted(Comparator.comparing(handPlayer -> handPlayer.getRank().getValue())).collect(Collectors.toList()));
    }
}
