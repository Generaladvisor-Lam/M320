package Spieler;

public class Angreifer extends Spieler {

    public short stundenTrainiert;

    public Angreifer(String name) {
        super(name);
        stundenTrainiert = 0;
    }

    public void jobTraining(short stunden) {
        stundenTrainiert += stunden;
    }

    @Override
    public void zeigeName() {
        System.out.println("\nName des Angreifers: " + name + "\nStunden trainiert: " + stundenTrainiert);
    }
}
