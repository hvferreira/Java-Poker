package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class PokerTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/poker.csv", numLinesToSkip = 1)
    void table(String player1HandString, String player2HandString, String winner, String rankingString) {
        Ranking ranking = Ranking.valueOf(rankingString);
        Poker poker = new Poker();
        poker.addPlayer(new Player());
        poker.addPlayer(new Player());
        String[] arrSplitCardplayer1 = player1HandString.split(" ");
        String[] arrSplitCardplayer2 = player2HandString.split(" ");
        ArrayList<Card> cards = new ArrayList<>();
        Rank[] ranks = Rank.getAllranks();

        for (String s : arrSplitCardplayer1) {
            for (Rank r : ranks) {
                if (r.getSTring().equals(String.valueOf(s.charAt(0)))) {
                    cards.add(new Card(Suit.valueOf(String.valueOf(s.charAt(1))), r));
                }
            }
        }
        poker.getPlayerList().get(0).setHand(new ArrayList<>(cards.stream().sorted(Comparator.comparing(handPlayer ->
                handPlayer.getRank().getValue())).collect(Collectors.toList())));
        cards = new ArrayList<>();
        for (String s : arrSplitCardplayer2) {
            for (Rank r : ranks) {
                if (r.getSTring().equals(String.valueOf(s.charAt(0)))) {
                    cards.add(new Card(Suit.valueOf(String.valueOf(s.charAt(1))), r));
                }
            }
        }
        poker.getPlayerList().get(1).setHand(new ArrayList<>(cards.stream().sorted(Comparator.comparing(handPlayer ->
                handPlayer.getRank().getValue())).collect(Collectors.toList())));

        poker.table();

        assertEquals(winner, poker.playerWin());

    }


    @ParameterizedTest
    @CsvFileSource(resources = "/straightflush.csv", numLinesToSkip = 1)
    void straightFlush(String handString, String rankingString) {
        Ranking ranking = Ranking.valueOf(rankingString);
        Poker poker = new Poker();
        poker.addPlayer(new Player());
        String[] arrSplitCard = handString.split(" ");
        ArrayList<Card> cards = new ArrayList<>();
        Rank[] ranks = Rank.getAllranks();

        for (String s : arrSplitCard) {
            for (Rank r : ranks) {
                if (r.getSTring().equals(String.valueOf(s.charAt(0)))) {
                    cards.add(new Card(Suit.valueOf(String.valueOf(s.charAt(1))), r));
                }
            }
        }
        poker.getPlayerList().get(0).setHand(new ArrayList<>(cards.stream().sorted(Comparator.comparing(handPlayer ->
                handPlayer.getRank().getValue())).collect(Collectors.toList())));
        poker.table();
        assertEquals(Ranking.Straightflush, poker.getPlayerList().get(0).getRanking());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/fourofakind.csv", numLinesToSkip = 1)
    void fourOfaKind(String handString, String rankingString) {
        Ranking ranking = Ranking.valueOf(rankingString);
        Poker poker = new Poker();
        poker.addPlayer(new Player());
        String[] arrSplitCard = handString.split(" ");
        ArrayList<Card> cards = new ArrayList<>();
        Rank[] ranks = Rank.getAllranks();

        for (String s : arrSplitCard) {
            for (Rank r : ranks) {
                if (r.getSTring().equals(String.valueOf(s.charAt(0)))) {
                    cards.add(new Card(Suit.valueOf(String.valueOf(s.charAt(1))), r));
                }
            }
        }
        poker.getPlayerList().get(0).setHand(new ArrayList<>(cards.stream().sorted(Comparator.comparing(handPlayer ->
                handPlayer.getRank().getValue())).collect(Collectors.toList())));
        poker.table();
        assertEquals(Ranking.Fourofakind, poker.getPlayerList().get(0).getRanking());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/fullhouse.csv", numLinesToSkip = 1)
    void fullHouse(String handString, String rankingString) {
        Ranking ranking = Ranking.valueOf(rankingString);
        Poker poker = new Poker();
        poker.addPlayer(new Player());
        String[] arrSplitCard = handString.split(" ");
        ArrayList<Card> cards = new ArrayList<>();
        Rank[] ranks = Rank.getAllranks();

        for (String s : arrSplitCard) {
            for (Rank r : ranks) {
                if (r.getSTring().equals(String.valueOf(s.charAt(0)))) {
                    cards.add(new Card(Suit.valueOf(String.valueOf(s.charAt(1))), r));
                }
            }
        }
        poker.getPlayerList().get(0).setHand(new ArrayList<>(cards.stream().sorted(Comparator.comparing(handPlayer ->
                handPlayer.getRank().getValue())).collect(Collectors.toList())));
        poker.table();
        assertEquals(Ranking.FullHouse, poker.getPlayerList().get(0).getRanking());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/straight.csv", numLinesToSkip = 1)
    void straight(String handString, String rankingString) {
        Ranking ranking = Ranking.valueOf(rankingString);
        Poker poker = new Poker();
        poker.addPlayer(new Player());
        String[] arrSplitCard = handString.split(" ");
        ArrayList<Card> cards = new ArrayList<>();
        Rank[] ranks = Rank.getAllranks();

        for (String s : arrSplitCard) {
            for (Rank r : ranks) {
                if (r.getSTring().equals(String.valueOf(s.charAt(0)))) {
                    cards.add(new Card(Suit.valueOf(String.valueOf(s.charAt(1))), r));
                }
            }
        }
        poker.getPlayerList().get(0).setHand(new ArrayList<>(cards.stream().sorted(Comparator.comparing(handPlayer ->
                handPlayer.getRank().getValue())).collect(Collectors.toList())));
        poker.table();
        assertEquals(Ranking.Straight, poker.getPlayerList().get(0).getRanking());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/flush.csv", numLinesToSkip = 1)
    void flush(String handString, String rankingString) {
        Ranking ranking = Ranking.valueOf(rankingString);
        Poker poker = new Poker();
        poker.addPlayer(new Player());
        String[] arrSplitCard = handString.split(" ");
        ArrayList<Card> cards = new ArrayList<>();
        Rank[] ranks = Rank.getAllranks();

        for (String s : arrSplitCard) {
            for (Rank r : ranks) {
                if (r.getSTring().equals(String.valueOf(s.charAt(0)))) {
                    cards.add(new Card(Suit.valueOf(String.valueOf(s.charAt(1))), r));
                }
            }
        }
        poker.getPlayerList().get(0).setHand(new ArrayList<>(cards.stream().sorted(Comparator.comparing(handPlayer ->
                handPlayer.getRank().getValue())).collect(Collectors.toList())));
        poker.table();
        assertEquals(Ranking.Flush, poker.getPlayerList().get(0).getRanking());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/threeofakind.csv", numLinesToSkip = 1)
    void threeOfAKind(String handString, String rankingString) {
        Ranking ranking = Ranking.valueOf(rankingString);
        Poker poker = new Poker();
        poker.addPlayer(new Player());
        String[] arrSplitCard = handString.split(" ");
        ArrayList<Card> cards = new ArrayList<>();
        Rank[] ranks = Rank.getAllranks();

        for (String s : arrSplitCard) {
            for (Rank r : ranks) {
                if (r.getSTring().equals(String.valueOf(s.charAt(0)))) {
                    cards.add(new Card(Suit.valueOf(String.valueOf(s.charAt(1))), r));
                }
            }
        }
        poker.getPlayerList().get(0).setHand(new ArrayList<>(cards.stream().sorted(Comparator.comparing(handPlayer ->
                handPlayer.getRank().getValue())).collect(Collectors.toList())));
        poker.table();
        assertEquals(Ranking.ThreeofaKind, poker.getPlayerList().get(0).getRanking());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/twopair.csv", numLinesToSkip = 1)
    void twoPair(String handString, String rankingString) {
        Ranking ranking = Ranking.valueOf(rankingString);
        Poker poker = new Poker();
        poker.addPlayer(new Player());
        String[] arrSplitCard = handString.split(" ");
        ArrayList<Card> cards = new ArrayList<>();
        Rank[] ranks = Rank.getAllranks();

        for (String s : arrSplitCard) {
            for (Rank r : ranks) {
                if (r.getSTring().equals(String.valueOf(s.charAt(0)))) {
                    cards.add(new Card(Suit.valueOf(String.valueOf(s.charAt(1))), r));
                }
            }
        }
        poker.getPlayerList().get(0).setHand(new ArrayList<>(cards.stream().sorted(Comparator.comparing(handPlayer ->
                handPlayer.getRank().getValue())).collect(Collectors.toList())));
        poker.table();
        assertEquals(Ranking.TwoPairs, poker.getPlayerList().get(0).getRanking());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/onepair.csv", numLinesToSkip = 1)
    void onePair(String handString, String rankingString) {
        Ranking ranking = Ranking.valueOf(rankingString);
        Poker poker = new Poker();
        poker.addPlayer(new Player());
        String[] arrSplitCard = handString.split(" ");
        ArrayList<Card> cards = new ArrayList<>();
        Rank[] ranks = Rank.getAllranks();

        for (String s : arrSplitCard) {
            for (Rank r : ranks) {
                if (r.getSTring().equals(String.valueOf(s.charAt(0)))) {
                    cards.add(new Card(Suit.valueOf(String.valueOf(s.charAt(1))), r));
                }
            }
        }
        poker.getPlayerList().get(0).setHand(new ArrayList<>(cards.stream().sorted(Comparator.comparing(handPlayer ->
                handPlayer.getRank().getValue())).collect(Collectors.toList())));
        poker.table();
        assertEquals(Ranking.OnePair, poker.getPlayerList().get(0).getRanking());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/highcard.csv", numLinesToSkip = 1)
    void highCard(String handString, String rankingString) {
        Ranking ranking = Ranking.valueOf(rankingString);
        Poker poker = new Poker();
        poker.addPlayer(new Player());
        String[] arrSplitCard = handString.split(" ");
        ArrayList<Card> cards = new ArrayList<>();
        Rank[] ranks = Rank.getAllranks();

        for (String s : arrSplitCard) {
            for (Rank r : ranks) {
                if (r.getSTring().equals(String.valueOf(s.charAt(0)))) {
                    cards.add(new Card(Suit.valueOf(String.valueOf(s.charAt(1))), r));
                }
            }
        }
        poker.getPlayerList().get(0).setHand(new ArrayList<>(cards.stream().sorted(Comparator.comparing(handPlayer ->
                handPlayer.getRank().getValue())).collect(Collectors.toList())));
        poker.table();
        assertEquals(Ranking.HighCard, poker.getPlayerList().get(0).getRanking());

    }
}