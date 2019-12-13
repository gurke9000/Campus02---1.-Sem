package map;

import java.util.HashMap;

public class DemoMap {

    public static void main(String[] args) {

        HashMap<String,String> dictionary = new HashMap<>();

        dictionary.put("Baum","tree");
        dictionary.put("Haus","house");
        dictionary.put("geschenk","gift");
        dictionary.put("weihnachten","x-mas");

        System.out.println("dictionary = " + dictionary);

        System.out.println("größe dic = " + dictionary.size());

        dictionary.put("weihnachten","x-mas");
        dictionary.put("weihnachten","x-mas");
        dictionary.put("weihnachten","x-mas");

        System.out.println("größe dic = " + dictionary.size());
        //haut nicht öfter rein, weil so gscheid ist.

        dictionary.put("weihnachten","christmas");
        System.out.println("größe dic = " + dictionary.size());

        String baumInEnglish = dictionary.get("Baum");
        System.out.println(baumInEnglish);

        dictionary.remove("weihnachten");
        if(dictionary.containsKey("weihnachten"))
        {
            System.out.println(dictionary.get("weihnachten"));
        }
        else{
            System.out.println("hab keine Übersetzung gefunden..");
        }

        for(String deutsch : dictionary.keySet())
        {
            System.out.println(deutsch + " heißt in English " + dictionary.get(deutsch));
        }

    }
}
