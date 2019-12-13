package Oop2;

public class DemoAddress {

    Customer c = new Customer(1234);
        c.addA(new Address("Grazerstraße 1", "Graz", "8010", "AT"));
        c.addA(new Address("Gleisdorf 1", "Gleisdorf", "8200", "AT"));

    c.setFirstName = "Susi";
    c.setLastName = "Sorglos";

        System.out.println(c);

}
