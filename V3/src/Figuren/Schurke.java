package Figuren;

import Waffen.Waffe;

public class Schurke extends Figur {
    public Schurke(String name, Waffe waffe) {
        super(name, waffe);
    }

    @Override
    public void kaempfen() {
        System.out.println("Schurke " + name + " " + waffe.verwendetWaffe());
    }
}
