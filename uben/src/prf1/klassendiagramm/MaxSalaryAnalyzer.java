package prf1.klassendiagramm;

import java.util.ArrayList;

public class MaxSalaryAnalyzer extends PersonAnalyzer {

    private ArrayList<Person> LotsOfCash = new ArrayList<>();

    @Override
    public void analyze() {
        double maxCash = 0;
        for (Person p: persons)
        {
            if(p.getSalary()> maxCash)
            {
                maxCash = p.getSalary();
            }
        }

        for (Person p: persons)
        {
            if(p.getSalary() == maxCash)
            {
                LotsOfCash.add(p);
            }
        }

        System.out.println("Folgenden Personen verdienen " + maxCash + ": " + LotsOfCash.toString());
    }
}
