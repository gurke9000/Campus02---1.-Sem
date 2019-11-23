public class Konto {

    private String inhab;
    private double stand;

    public String getInhab()
    {
        return inhab;
    }

    public double getStand()
    {
        return stand;
    }

/*    public void setInhab(String inhab)
    {
        this.inhab = inhab;
        stand = 0;
      //System.out.println("Inhaber: " + inhab + "Kontostand: " + stand);
   }


 */

    public Konto(String inhab)
    {
        this.inhab = inhab;
        this.stand = 100;
//    automatisch immer Wert x einem neuen Konto zugewiesen
//    in diesem Fall besser, als eine Setter Methode

    }

    public void aufbuchen(double x)
    {
        if(x > 0)
        stand += x;
      //System.out.println("neuer Kontostand nach Buchung " + x + ": " + stand);
    }

    public void abbuchen(double x)
    {
        if(stand >= x)
        {
            stand -= x;
            System.out.println("neuer Kontostand nach Buchung " + x + ": " + stand + " von " + inhab + "'s Konto");
        }
        else
        {
            System.out.println("Haha " + inhab + ", nicht genügend Geld!");
        }
    }
}
