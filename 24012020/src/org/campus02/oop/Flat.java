package org.campus02.oop;

import com.sun.codemodel.internal.JCase;

public class Flat extends RealEstate {

    public int countRoom;
    public String type;


    public static final String Low = "Low";
    public static final String High = "High";
    public static final String Standard = "Standard";
    public static final String Undefined = "Undefined";


    public Flat(int squaremeter, int countRoom, String type) {
        super(squaremeter);
        this.countRoom = countRoom;


        if(type.equalsIgnoreCase(Low))
            this.type = Low;
        else if(type.equalsIgnoreCase(High))
            this.type=High;
        else if(type.equalsIgnoreCase(Standard))
            this.type=Standard;
        else
        {
            System.out.println(type + " gibbet nüsch als Type");
            this.type=Undefined;
        }
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
