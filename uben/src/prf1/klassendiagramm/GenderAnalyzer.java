package prf1.klassendiagramm;

public class GenderAnalyzer extends PersonAnalyzer {

    public GenderAnalyzer()
    {}

    @Override
    public void analyze() {
        int counterM = 0;
        int sizeM = 0;
        int counterF = 0;
        int sizeF = 0;

        for(Person p: persons)
        {
            if(p.getGender()== 'M')
            {
                counterM++;
                sizeM += p.getSize();
            }
            else
            {
                counterF++;
                sizeF+=p.getSize();
            }

            System.out.println("In der Liste existieren " + counterM + " Männer mit einer durchschnittlichen Größe von " + sizeM/counterM);
            System.out.println("In der Liste existieren " + counterF + " Frauen mit einer durchschnittlichen Größe von " + sizeF/counterF);
        }
    }
}
