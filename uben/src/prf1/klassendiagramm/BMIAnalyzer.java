package prf1.klassendiagramm;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer {

    private ArrayList<Pair<Person,Double>> result = new ArrayList<>();

    public ArrayList<Pair<Person, Double>> getResult() {
        return result;
    }

    private double calcBMI(Person p)
    {
      return p.getWeight() / (p.getSize() / 100.0) * (p.getSize() / 100.0);
    }

    @Override
    public void analyze() {
    for (Person p : persons)
        {
            double bmi = calcBMI(p);
            result.add(new Pair<Person,Double> (p,bmi));
        }
    }
}
