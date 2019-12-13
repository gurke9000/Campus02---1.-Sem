package Oop2;

import java.util.ArrayList;

public class Customer {

    private int CostumerNumber;

    public Customer(int costumerNumber) {
        CostumerNumber = costumerNumber;
    }

    private ArrayList<Address> Addresses = new ArrayList<Address>();

    public void addAddress (Address a)
    {
        if(!Addresses.contains(a))
            Addresses.add(a);
    }


    @Override
    public String toString() {
        return "Customer{" +
                "CostumerNumber=" + CostumerNumber +
                ", Addresses=" + Addresses +
                '}';
    }
}
