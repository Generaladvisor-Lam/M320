package Spieler;

public class Verteidiger extends Spieler {

    public Verteidiger(String name) {
        super(name);
    }

    @Override
    public void zeigeName() {
        System.out.println("\nName des Verteidigers: " + name);
    }
}
