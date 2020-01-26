package org.campus02.oop;

public class RealEstate {

    public int squaremeter;

    public RealEstate(int squaremeter) {
        this.squaremeter = squaremeter;
    }

    public int getSquaremeter() {
        return squaremeter;
    }

    public double calcLease()
    {
        return squaremeter*10;
    }

    public int getCategory()
    {
        return squaremeter/10;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "squaremeter=" + squaremeter +
                '}';
    }
}
