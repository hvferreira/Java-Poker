package org.example;

public enum Ranking {

    Straightflush,Fourofakind,FullHouse,Flush,Straight,ThreeofaKind,TwoPairs,Pair,HighCard;

    private static final Ranking[] rankings= Ranking.values();

    public static Ranking[] getAllRanking(){

        return rankings;
    }
}
