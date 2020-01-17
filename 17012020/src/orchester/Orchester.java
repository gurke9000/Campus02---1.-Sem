package orchester;

import java.util.ArrayList;

public class Orchester {

    private ArrayList<Instrument> orch = new ArrayList<>();

    public Orchester(ArrayList<Instrument> orch)
    {
        this.orch = orch;
    }

    public int playAll()
    {
        int sum = 0;
        for(Instrument i : orch)
        {
            sum += i.play();
        }

        return sum;
    }
}
