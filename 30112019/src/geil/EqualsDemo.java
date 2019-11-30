package geil;

import java.util.ArrayList;

public class EqualsDemo {

    public static void main(String[] args) {
        Person p1= new Person("Andy","E");
        Person p3= new Person("Andy","E");
        Person p2= new Person("Lukas","B");

        if(p1.equals(p3))
        {
            System.out.println("same");
        }
        else
        {
            System.out.println("andere Person");
        }

        ArrayList<Person> personen = new ArrayList<>();
        personen.add(p1);
        personen.add(p2);

        if(personen.contains(p3))
        {
            System.out.println("gibts schon, Trottel");
        }
        else
        {
            personen.add(p3);
        }

        System.out.println(personen);
    }
}
