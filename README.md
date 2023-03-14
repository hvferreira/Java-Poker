# Poker Hands

Goal of this project is to compare several pairs of poker hands to indicate, which, if either, has a higher rank. I
started expanding my design and creating the code. This was developed in Java 17.

## Assumptions

Deck contains 52 cards
Each card has a suit (Clubs - C, Spades - S, Diamonds - D and Hearts - H)
Each card has a value: 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King and Ace
For score:
Suits are unordered
Values are ordered
Values are ordered
2 is the lowest and Ace the highest value
Poker hand consists of 5 cards from the deck.
Poker hands are ranked by the following partial order from lower to highest:

- High Card: Scored by the value of the highest card when it does not fit in any category. If they have the same value,
  the hands are ranked by the next highest card, and so on.
- Pair: 2 cards have the same value. When both have pairs, hands are ranked by the highest pair. If these values are the
  same, the hands are ranked by the highest values of the cards not forming the pair.
- Two pairs: 2 different pairs. When both have 2 pairs it is ranked by the highest pair. When there is the same high
  pair, hands are ranked by the second pair. When both pairs are the same it is ranked by the value of the remaining
  card.
- Three of a Kind: 3 cards have the same value. When both hands contain three of a kind it is scored by the value of the
  3 cards.
- Straight: 5 consecutive values. When both contain a straight, they are ranked by highest card.
- Flush: 5 cards of the same suit. When both have flushes it is scored by the rule of highest card.
- Full House: 3 cards have the same value, remaining 2 form a pair. Ranked by the value of the 3 cards.
- Four of a kind: 4 cards with the same value. Ranked by the value of the 4 cards.
- Straight flush: 5 cards with the same suit and consecutive values. Ranked by the highest card.

## Approaches

Check repetitions to add to enumerate
Do it in a general approach and adaptable to different situations
Use stream do reduce code and increase efficiency
Use Lambda
Try to build it in a way that can be adaptable to other card games

## UML

![This is an image](https://github.com/hvferreira/Java-Poker/blob/master/UML/uml.png)

## Future Thoughts

Add more players.
Compare more players at the same time.
Add more rules.
Add more game cards.
Graphic design.
