public class Person {

    private String vorname;
    private String nachname;
    private int groesse;
    private byte actLevel;


    public Person(String vorname, String nachname, int groesse, byte actLevel) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.groesse = groesse;
        this.actLevel = actLevel;

    }

    public String level(byte actLevel){
        if(actLevel == 1)
        {
            return "Couch Potato";
        }
        else{
            if (actLevel == 2)
            {
                return "Gelegenheitssportler";
            }
            else
            {
                if (actLevel == 3)
                {
                    return "Sportler";
                }
                else
                {
                    return "Profisportler";
                }
            }
        }

    }


    public String rechneBMI(int gewicht) {
        double bmi = (gewicht * 1.0) / ((groesse / 100.0) * (groesse / 100.0));
        if (bmi < 18.5) {
            return "Untergewicht";
        } else {
            if (bmi >= 18.5 && bmi < 25) {
                return "Normalgewicht";
            } else {
                if (bmi >= 25 && bmi < 30) {
                    return "Übergewicht";
                } else {
                    return "Adipositas";
                }
            }
        }
    }

    public void printPerson(int gewicht)
    {
        System.out.println(vorname + nachname + ", " + level(actLevel) + ", " + rechneBMI(gewicht));
    }

}