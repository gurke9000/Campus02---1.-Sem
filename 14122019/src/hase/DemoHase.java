package hase;

import java.util.ArrayList;

public class DemoHase {

    public static void main(String[] args) {
        Hase h1 = new Hase("bugs bunny");
        Hase h2 = new Weihnachtshase("mediamarkt");
        Hase h3 = new Osterhase("fotzi");

        h1.fressen();
        h1.hoppeln();
        h1.schlafen();
        h1.verteilen();

        h2.fressen();
        h2.hoppeln();
        h2.schlafen();
        h2.verteilen();

        h3.fressen();
        h3.hoppeln();
        h3.schlafen();
        h3.verteilen();

        ArrayList<Hase> stall = new ArrayList<>();
        stall.add(h1);
        stall.add(h2);
        stall.add(h3);
        stall.add(new Hase("tester"));

        for(Hase hase : stall)
        {
            hase.fressen();
            hase.verteilen();
        }

    }
}
