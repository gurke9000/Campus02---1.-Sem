package staat;

import java.util.ArrayList;

public class DemoLand {
    public static void main(String[] args) {

        Bundesland Stmk = new Bundesland(1);
        Bundesland Wien = new Bundesland(1);
        Bundesstaat austro = new Bundesstaat();

        austro.addLand(Stmk);
        austro.addLand(Wien);

        System.out.println(austro.getBSP());

        Bundesstaat eu = new Bundesstaat();

        eu.addLand(austro);
        //weil austro ja auch ein Land ist



    }
}
