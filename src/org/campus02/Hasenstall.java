package org.campus02;

import java.util.ArrayList;

public class Hasenstall {
    private ArrayList<Hase> stall = new ArrayList<>(); //dem Hasenstall ist es egal, welcher Hase kommt

    public void add(Hase h) {
        stall.add(h);
    }

    public void füttern() {
        for(Hase h : stall) { // alles hasen kriegen fressen
            h.fressen();
        }
    }
    public void verteilen() {
        for (Hase h : stall) {
            h.verteilen();
        }
    }
}
