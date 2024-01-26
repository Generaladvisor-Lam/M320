package Spieler;

public class Goalie extends Spieler {

    private short koerperGroesse;

    public Goalie(String name, short koerperGroesse) {
        super(name);
        this.koerperGroesse = koerperGroesse;
    }

    @Override
    public void zeigeName() {
        System.out.println("\nName des Goalies: " + name + "\nGroesse des Goalies: " + koerperGroesse);
    }
}
