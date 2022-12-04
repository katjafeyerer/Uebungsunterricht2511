package org.campus02;

public class WeihnachtsHase extends Hase {
    public String bestFriend;

    public WeihnachtsHase(String name, String bestFriend) { //Konstruktor erstellen -> wird automatisch erstellt
        super(name);
        this.bestFriend=bestFriend;
    }
    @Override
    public void verteilen() {
        System.out.println(name + " verteilt die Geschenke unter dem Christbaum");
    }

    public String getBestFriend() {
        return bestFriend;
    }
}
