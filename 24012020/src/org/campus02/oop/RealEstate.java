package org.campus02.oop;

public abstract class RealEstate {

    public int squaremeter;

    public RealEstate(int squaremeter) {
        this.squaremeter = squaremeter;
    }

    public int getSquaremeter() {
        return squaremeter;
    }

    public abstract double calcLease();

    public void setSquaremeter(int squaremeter){ this.squaremeter=squaremeter;}

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

