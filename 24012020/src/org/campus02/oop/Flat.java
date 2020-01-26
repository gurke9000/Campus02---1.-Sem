package org.campus02.oop;

import com.sun.codemodel.internal.JCase;

public class Flat extends RealEstate {

    public int countRoom;
    public String type;

    public Flat(int squaremeter, int countRoom, String type) {
        super(squaremeter);
        this.countRoom = countRoom;
        this.type = type;
    }

    public int getCountRoom() {
        return countRoom;
    }

    public void setCountRoom(int countRoom) {
        this.countRoom = countRoom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double calcLease() {
        switch (type)
        {
            case "Low": return getSquaremeter()*7;

            case "Standard": return getSquaremeter()*7.5 + getCountRoom()*10;

            case "High": return getSquaremeter()*8 + getCountRoom()*12;

            default: return -1;

        }
    }


}
