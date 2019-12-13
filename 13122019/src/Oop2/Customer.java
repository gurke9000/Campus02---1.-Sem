package Oop2;

import java.util.ArrayList;

    public class Customer extends Person {
        private int customerNumber;
        private ArrayList<Address> addresses;

        public Customer(int customerNumber) {
            this.customerNumber = customerNumber;
            addresses = new ArrayList<>();
        }

        public void addA (Address a)
        {
            addresses.add(a);
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "firstname=" + getFirstName() +
                    "lastname=" + getLastName() +
                    "customerNumber=" + customerNumber +
                    ", addresses=" + addresses +
                    '}';
}
