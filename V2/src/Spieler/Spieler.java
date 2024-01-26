package Spieler;

public class Spieler {

    protected String name;

    public Spieler(String name) {
        this.name = name;
    }

    public void zeigeName() {
        System.out.println("\nName des Spielers: " + name);
    }
}
