package org.example;

public enum Rank {
    Two("2", 2), THREE("3", 3), FOUR("4", 4), FIVE("5", 5), SIX("6", 6),
    SEVEN("7", 7), EIGHT("8", 8), NINE("9", 9), TEN("T", 10), JACK("J", 11),
    QUEEN("Q", 12), KING("K", 13), ACE("A", 14),
    ;

    private final String rank;
    private final int value;
    private static final Rank[] ranks = Rank.values();

    Rank(String rank, int value) {
        this.rank = rank;
        this.value = value;
    }

    public static Rank[] getAllranks() {

        return ranks;
    }

    public String getSTring() {
        return this.rank;
    }

    public int getValue() {
        return this.value;
    }
}
