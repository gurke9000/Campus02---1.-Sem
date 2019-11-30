package geil;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<String> personen = new ArrayList<>();

        personen.add("lukas");
        personen.add("berni");
        personen.add("andy");

        System.out.println("anzahl: " + personen.size());

        for( String person : personen)
        {
            System.out.println("person = " + person);
        }

        for(int i = 0; i < personen.size(); i++)
        {
            System.out.println("person = " + personen.get(i));
        }

        System.out.println(personen);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(20);
        numbers.add(1000);
        System.out.println(numbers);

        System.out.println("beinhaltet 1? " + numbers.contains(1));
        System.out.println("beinhaltet 2? " + numbers.contains(2));

        numbers.remove(2);
        System.out.println(numbers);

        numbers.remove(new Integer(20));
        System.out.println(numbers);
    }
}
