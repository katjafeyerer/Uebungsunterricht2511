package org.campus02;

import javax.xml.namespace.QName;

public class OsterHase extends Hase {

    public OsterHase(String name) { //Konstruktor erstellen -> wird automatisch erstellt
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(name + "verteilt Geschenke und Ostereier in der Wiese");
    }

    @Override
    public void schlafen() {
        System.out.println(name + "schläft nie");
    }

}
