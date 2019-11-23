public class Car {

    public String color;
    public String manufact;
    // public int prod_year;
    public int prodYear;
    public String antrieb;
    public int leistung;
    public double co2Output;

    private int currGear;

    public int getCurrGear()
    {
        return currGear;
    }

    public void shiftGear(){
        currGear++;
    }

    public void shiftGear(int gear){
        if(currGear + gear < 1)
            return;
        if(currGear + gear <= 7)
        currGear += gear;
    }

    public void setGear1(int gear){
        currGear = gear;
    }

    public void setGear(int currGear){
        this.currGear = currGear;
    }
}

