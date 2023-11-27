package BlackJack;

import CardDeck.CardDeck;
import CardDeck.Card;

import java.util.Scanner;

public class BlackJack {

    Scanner scan;

    public BlackJack() {
        scan = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to BlackJack.");
        while (true) {
            System.out.println("Enter y to start a new game.");
            while (ScanYN()) {
                CardDeck cardDeck = new CardDeck();
                Hand host = new Hand(handleDrawCard(cardDeck), handleDrawCard(cardDeck));
                Hand guest = new Hand(handleDrawCard(cardDeck), handleDrawCard(cardDeck));
                guest.printHand();
                if (guest.isBlackJack()) {
                    System.out.println("Congratulations! You have a BlackJack!");
                } else {
                    System.out.println("Enter y to draw a card, n to keep your Hand");
                    while (ScanYN()) {
                        guest.receiveCard(handleDrawCard(cardDeck));
                        System.out.println("Enter y to draw a card, n to keep your Hand");
                    }
                }
                if (guest.isBust()) {
                    delay();
                    break;
                }
                System.out.println("Host's turn");
            }
        }
    }

    private boolean ScanYN() {
        while (true) {
            String input = scan.nextLine();
            if (input.equals("y")) {
                return true;
            } else if (input.equals("n")) {
                return false;
            }
        }
    }

    private Card handleDrawCard (CardDeck cardDeck) {
        try {
            return cardDeck.drawCard();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private void delay() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
