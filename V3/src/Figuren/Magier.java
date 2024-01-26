package Figuren;

import Waffen.Waffe;

public class Magier extends Figur {
    public Magier(String name, Waffe waffe) {
        super(name, waffe);
    }

    @Override
    public void kaempfen() {
        System.out.println("Magier " + name + " " + waffe.verwendetWaffe());
    }
}
