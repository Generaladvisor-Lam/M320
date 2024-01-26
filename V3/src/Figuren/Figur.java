package Figuren;

import Waffen.Waffe;

public class Figur {

    protected String name;

    protected Waffe waffe;

    public Figur(String name, Waffe waffe) {
        this.name = name;
        this.waffe = waffe;
    }

    public void kaempfen() {
        System.out.println(name + " " +waffe.verwendetWaffe());
    }
}
