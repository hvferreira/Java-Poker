package org.example;

import com.sun.jdi.Value;

public enum Rank {
    ACE("A"),Two("2"),THREE("3"),FOUR("4"),FIVE("5"),SIX("6"),SEVEN("7"),EIGHT("8"),NINE("9"),TEN("T"),JACK("J"),QUEEN("Q"),KING("K");

    private final String rank;
    private static final Rank[] ranks = Rank.values();
    Rank(String rank)
    {
        this.rank = rank;
    }
    public static Rank[] getAllranks(){

        return ranks;
    }

    public String getSTring()
    {
        return this.rank;
    }
}
