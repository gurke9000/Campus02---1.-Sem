package hase;

public class Weihnachtshase extends Hase {
    public Weihnachtshase(String name) {
        super(name);
    }

    @Override
    public void verteilen()
    {
        System.out.println(getName() + " verteilt die Geschenke under se Xmas tree");
    }
}
