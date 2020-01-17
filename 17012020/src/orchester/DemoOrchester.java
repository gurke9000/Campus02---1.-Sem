package orchester;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class DemoOrchester {

    public static void main(String[] args) {

        Orchester o = new Orchester(new ArrayList<Instrument>());
        // o.add(new Gitarre(3));
      //siehe github für finale lösung.. der scheiß hat mich gerade zu hart gefickt..

        int sumLautstaerke = o.playAll();
        System.out.println("Orchester spielt mit LS: " + sumLautstaerke);
    }

}
