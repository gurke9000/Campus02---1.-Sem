package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Accounting {

    private ArrayList<RealEstate> stuffs = new ArrayList<>();

    public void add(RealEstate f)
    {
        stuffs.add(f);
    }

    public void printAll()
    {
        for(RealEstate f: stuffs)
        {
            System.out.println("Groesse: " + f.getSquaremeter() + "   Miete: " + f.calcLease() + "\n");
        }
    }

    public double getOverallLease()
    {
        double sum = 0;
        for(RealEstate f: stuffs)
        {
            sum += f.calcLease();
        }

        return sum;
    }

    public double getAvgLease()
    {
        return getOverallLease() / stuffs.size();
    }

    public HashMap<Integer, Double> getRealEstateInCategory()
    {
        HashMap<Integer, Double> map = new HashMap<>();
        for(RealEstate f: stuffs)
        {
            if(map.containsKey(f.getCategory()))
            {
                double value = map.get(f.getCategory());
                value += 1;
                map.put(f.getCategory(), value);
            }
            else
                map.put(f.getCategory(), 1.0);
        }

        return map;
    }
}
