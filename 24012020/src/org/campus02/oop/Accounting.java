package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Accounting extends RealEstate {

    private ArrayList<RealEstate> stuffs = new ArrayList<>();

    public Accounting(int squaremeter, ArrayList<RealEstate> stuffs) {
        super(squaremeter);
    }

    public void add(RealEstate f)
    {
        stuffs.add(f);
    }

    public void printAll()
    {
        for(RealEstate f: stuffs)
        {
            System.out.println("Groesse: " + f.getSquaremeter() + "   Miete: " + f.calcLease());
        }
    }

    public double getOverallLease()
    {
        double avg = 0;
        for(RealEstate f: stuffs)
        {
            avg += f.calcLease();
        }

        return avg / stuffs.size();
    }

    public HashMap<Integer, Double> getRealEstateInCategory()
    {
        int counter = 0;
        for(RealEstate f: stuffs)
        {
            f.getCategory();
            counter++;
        }
    }
}
