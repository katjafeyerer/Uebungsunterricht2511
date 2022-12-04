package org.campus02;

public class DemoApp {
    public static void main(String[] args) {
        Hase hase = new Hase("Normaler Feldhase");
        hase.fressen();
        hase.verteilen();

        WeihnachtsHase santa = new WeihnachtsHase("Weihnachtshase", "Christkind");
        santa.fressen();


        OsterHase felix = new OsterHase("Osterhase");
        felix.fressen();

        System.out.println("----------------");
        Hase h1 = santa; //Weihnachtshase is a hase
        System.out.println("h1.verteilen");
        h1.verteilen();
        System.out.println(santa.getBestFriend()); //nicht mit h1.getBestFriend, weil Hase kennt nur seine Attribute
        System.out.println();


        Hasenstall hoppelwiese = new Hasenstall();
        hoppelwiese.add(hase);
        hoppelwiese.add(santa);
        hoppelwiese.add(felix);

        System.out.println(".... verteilen von Hoppelwiese");
        hoppelwiese.verteilen();//ich kenne nur die methoden, die hase mir liefert

        hoppelwiese.füttern();


        // geht so nicht: Weihnachtshase wh = h1;
        //Downcasting
        WeihnachtsHase wh = (WeihnachtsHase) h1;
        System.out.println(wh.getBestFriend());
    }


}
