package org.campus02.oop;

public class Office extends RealEstate {

    private int personen;

    private Office(int squaremeter, int personen) {
        super(squaremeter);
        this.personen = personen;
    }

    private void setPersonen(int personen) {
        this.personen = personen;
    }

    private int getPersonen() {
        return personen;
    }

    @Override
    public double calcLease() {
        if(getPersonen()<50)
        {
            return getSquaremeter()*8;
        }
        else
        {
            if(getPersonen()>=100)
            {
                return getSquaremeter()*8.5 + getPersonen();
            }
            else
            {
                return getSquaremeter()*8.2 + 90;
            }
        }
    }


}
