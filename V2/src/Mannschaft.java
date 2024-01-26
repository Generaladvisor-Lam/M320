import Spieler.*;


import java.util.ArrayList;

public class Mannschaft {

    private ArrayList<Spieler> spieler;

    public Mannschaft() {
        spieler = new ArrayList<>() {{
            add(new Spieler("Karin"));
            add(new Spieler("Siri"));
            add(new Spieler("Talha"));
            add(new Spieler("Cenric"));
            add(new Spieler("Brutus"));
            add(new Goalie("Tyree", (short) 200));
            add(new Goalie("Verena", (short) 198));
            add(new Goalie("Carly", (short) 178));
            add(new Goalie("Jindra", (short) 186));
            add(new Goalie("Kishor", (short) 210));
            add(new Angreifer("Marina"));
            add(new Angreifer("Royston"));
            add(new Angreifer("Tatiana"));
            add(new Angreifer("Swarna"));
            add(new Angreifer("Reumah"));
            add(new Verteidiger("Aras"));
            add(new Verteidiger("Emmanouil"));
            add(new Verteidiger("Kamau"));
            add(new Verteidiger("Fernando"));
            add(new Verteidiger("Antonio"));
        }};
    }

    public void trainAngreifer(short stunden) {
        spieler.stream()
                .filter(player -> player instanceof Angreifer)
                .forEach(a -> ((Angreifer) a).jobTraining(stunden));
    }

    public void printSpieler() {
        spieler.forEach(s -> s.zeigeName());
    }

}
