package staat;

import java.util.ArrayList;

public class Bundesstaat extends Land {

    private ArrayList<Land> laender = new ArrayList<>();

    public void addLand(Land l)
    {
        laender.add(l);
    }

    @Override
    public double getBSP() {
        double sum = 0;
        for(Land l : laender)
        {
            sum += l.getBSP();
        }
        return sum;
    }
}
