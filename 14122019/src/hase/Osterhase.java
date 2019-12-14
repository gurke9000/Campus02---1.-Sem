package hase;

public class Osterhase extends Hase {


    public Osterhase(String name) {
        super(name);
    }

    @Override
    public void verteilen()
    {
        System.out.println(getName() + " verteilt die Geschenke und große Kahoonas");
    }


}
