package org.campus02;

public class Hase {
    protected String name;

    //Konstruktor
    public Hase(String name) {
        this.name = name;
    }
    //public void schlafen
    public void schlafen() {
        System.out.println(name + " schläft");
    }

    //public void hoppeln
    public void hoppeln() {
        System.out.println(name + " hoppelt");
    }

    //public void fressen
    public void fressen() {
        System.out.println(name + " frisst");
    }

    //public void verteilen
    public void verteilen() {
        System.out.println(name + " ist ein Hase und verteilt nichts");
    }
}
