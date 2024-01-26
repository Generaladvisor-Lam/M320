import Figuren.Figur;
import Figuren.Krieger;
import Figuren.Magier;
import Figuren.Schurke;
import Waffen.Axt;
import Waffen.Dolch;
import Waffen.Stab;

import java.util.ArrayList;

public class Beispiel {

    private ArrayList<Figur> figuren;

    public Beispiel() {
        figuren = new ArrayList<>() {{
            add(new Magier("Keitel", new Dolch()));
            add(new Magier("Lawrence", new Axt()));
            add(new Magier("Trey", new Stab()));
            add(new Krieger("Leila", new Dolch()));
            add(new Krieger("Lana", new Axt()));
            add(new Krieger("Maria", new Stab()));
            add(new Schurke("Friedrich", new Dolch()));
            add(new Schurke("Arnold", new Axt()));
            add(new Schurke("Renate", new Stab()));
            add(new Figur("Hermann", new Dolch()));
            add(new Figur("Hagen", new Axt()));
            add(new Figur("Valda", new Stab()));
        }};
    }

    public void run() {
        figuren.forEach(figur -> figur.kaempfen());
    }
}
