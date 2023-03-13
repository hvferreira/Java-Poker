package org.example;

public enum Ranking {

    Straightflush(1), Fourofakind(2), FullHouse(3), Flush(4), Straight(5), ThreeofaKind(6),
    TwoPairs(7), OnePair(8), HighCard(9);

    private static final Ranking[] rankings = Ranking.values();
    private final int value;

    Ranking(int value) {
        this.value = value;
    }

    public static Ranking[] getAllRanking() {

        return rankings;
    }

    public int getValue() {
        return this.value;
    }
}
