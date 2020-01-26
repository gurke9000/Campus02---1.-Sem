package org.campus02.oop;

public class House extends RealEstate {

    public boolean hatGarten;

    public House(int squaremeter, boolean hatGarten) {
        super(squaremeter);
        this.hatGarten = hatGarten;
    }

    public boolean isHatGarten() {
        return hatGarten;
    }

    public void setHatGarten(boolean hatGarten) {
        this.hatGarten = hatGarten;
    }

    @Override
    public double calcLease() {
        double lease;
        if(hatGarten=true)
        {
            lease = getSquaremeter()*10 + 200;
        }

        else
        {
            lease = getSquaremeter()*15;
        }

        if(lease > 1000)
        {
            lease = 1000;
        }

        return lease;
    }
}
