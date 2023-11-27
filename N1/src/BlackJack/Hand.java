package BlackJack;

import CardDeck.Card;

import java.util.ArrayList;

public class Hand {

    private int points;

    private ArrayList<Card> cards;

    private boolean isBlackJack;

    private boolean isBust;

    public Hand(Card card1, Card card2) {
        cards.add(card1);
        cards.add(card2);
        if ((card1.getValue() == 1 && card2.getValue() == 10) || (card1.getValue() == 10 && card2.getValue() == 1)) {
            isBlackJack = true;
            points = 21;
        } else points = card1.getValue() + card2.getValue();
    }

    public void printHand() {
        System.out.println("Your hand:\n");
        for (Card c : cards) {
            System.out.print(c.getName() + "  ");
        }
        System.out.println("\nTotal points: " + points + "\n");
        if (isBust) {
            System.out.println("You have a Bust! Host won!");
        }
    }

    public void receiveCard(Card card) {
        cards.add(card);
        points += card.getValue();
        if (points > 21) {
            isBust = true;
        }
        this.printHand();
    }

    public boolean isBlackJack() {
        return isBlackJack;
    }

    public boolean isBust() {
        return isBust;
    }
}
