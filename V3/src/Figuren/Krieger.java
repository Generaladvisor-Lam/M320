package Figuren;

import Waffen.Waffe;

public class Krieger extends Figur{
    public Krieger(String name, Waffe waffe) {
        super(name, waffe);
    }

    @Override
    public void kaempfen() {
        System.out.println("Krieger " + name + " " + waffe.verwendetWaffe());
    }
}
