public class Bruch {

    private int nenner;
    private int zaehler;

    public Bruch(int zaehler, int nenner)
    {
        this.nenner = nenner;
        this.zaehler = zaehler;
    }

    public int getNenner()
    {
        return nenner;
    }

    public int getZaehler()
    {
        return zaehler;
    }

    public double toDecimal()
    {
        double dec = zaehler / (nenner * 1.0);
        return dec;
    }

    public void print()
    {
        System.out.println(zaehler + " / " + nenner);
    }

    public Bruch multiplicate(Bruch b2)
    {
        int Nenn = nenner*b2.getNenner();
        int Zaehl = zaehler*b2.getZaehler();

        Bruch neuerBruch = new Bruch(Zaehl,Nenn);
        return neuerBruch;
    }

    public Bruch multiplicate(Bruch b2, Bruch b3)
    {
        int Nenn = nenner*b2.getNenner()*b3.getNenner();
        int Zaehl = zaehler*b2.getZaehler()*b3.getZaehler();

        Bruch neuerBruch = new Bruch(Zaehl,Nenn);
        return neuerBruch;

//      return multiplicate(b2).multiplicate(b3);
    }
}
