package hase;

public class Hase {

    private String name;

    public Hase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void schlafen()
    {
        System.out.println(name + " schläft");
    }

    public void hoppeln()
    {
        System.out.println(name + " hoppelt schirch durch die Gegend");
    }

    public void fressen()
    {
        System.out.println(name + " frisst schon wieder ne Karotte");
    }

    public void verteilen()
    {
        System.out.println(name + " ist ein Hase und verteilt nichts!");
    }
}
