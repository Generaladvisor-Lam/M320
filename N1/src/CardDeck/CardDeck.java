package CardDeck;

import java.util.ArrayList;

public class CardDeck {

    private ArrayList<Card> cards;

    public CardDeck() {
        cards = new ArrayList<>() {{
            add(new Card("Ace of Hearts", 1));
            add(new Card("2 of Hearts", 2));
            add(new Card("3 of Hearts", 3));
            add(new Card("4 of Hearts", 4));
            add(new Card("5 of Hearts", 5));
            add(new Card("6 of Hearts", 6));
            add(new Card("7 of Hearts", 7));
            add(new Card("8 of Hearts", 8));
            add(new Card("9 of Hearts", 9));
            add(new Card("10 of Hearts", 10));
            add(new Card("Jack of Hearts", 10));
            add(new Card("Queen of Hearts", 10));
            add(new Card("King of Hearts", 10));

            add(new Card("Ace of Diamonds", 1));
            add(new Card("2 of Diamonds", 2));
            add(new Card("3 of Diamonds", 3));
            add(new Card("4 of Diamonds", 4));
            add(new Card("5 of Diamonds", 5));
            add(new Card("6 of Diamonds", 6));
            add(new Card("7 of Diamonds", 7));
            add(new Card("8 of Diamonds", 8));
            add(new Card("9 of Diamonds", 9));
            add(new Card("10 of Diamonds", 10));
            add(new Card("Jack of Diamonds", 10));
            add(new Card("Queen of Diamonds", 10));
            add(new Card("King of Diamonds", 10));

            add(new Card("Ace of Clubs", 1));
            add(new Card("2 of Clubs", 2));
            add(new Card("3 of Clubs", 3));
            add(new Card("4 of Clubs", 4));
            add(new Card("5 of Clubs", 5));
            add(new Card("6 of Clubs", 6));
            add(new Card("7 of Clubs", 7));
            add(new Card("8 of Clubs", 8));
            add(new Card("9 of Clubs", 9));
            add(new Card("10 of Clubs", 10));
            add(new Card("Jack of Clubs", 10));
            add(new Card("Queen of Clubs", 10));
            add(new Card("King of Clubs", 10));

            add(new Card("Ace of Spades", 1));
            add(new Card("2 of Spades", 2));
            add(new Card("3 of Spades", 3));
            add(new Card("4 of Spades", 4));
            add(new Card("5 of Spades", 5));
            add(new Card("6 of Spades", 6));
            add(new Card("7 of Spades", 7));
            add(new Card("8 of Spades", 8));
            add(new Card("9 of Spades", 9));
            add(new Card("10 of Spades", 10));
            add(new Card("Jack of Spades", 10));
            add(new Card("Queen of Spades", 10));
            add(new Card("King of Spades", 10));
        }};
    }

    public Card drawCard() {
        return null;
    }
}
