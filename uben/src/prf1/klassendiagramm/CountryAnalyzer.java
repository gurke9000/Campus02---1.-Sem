package prf1.klassendiagramm;

import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer {

    private HashMap<String, Integer> output = new HashMap<>();

    public HashMap<String, Integer> getOutput() {
        return output;
    }

    @Override
    public void analyze() {

        for(Person p: persons)
        {
            String country = p.getCountry();
            if (output.containsKey(country))
            {
                int pInC = output.get(country);
                output.put(country, pInC+1);
            }
            else
            {
                output.put(country,1);
            }
        }
    }
}
