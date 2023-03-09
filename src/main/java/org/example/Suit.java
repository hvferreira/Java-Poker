package org.example;

public enum Suit {

    C,D,H,S;

    private static final Suit[] suits= Suit.values();

    public static Suit[] getAllSuits(){

        return suits;
    }


}
