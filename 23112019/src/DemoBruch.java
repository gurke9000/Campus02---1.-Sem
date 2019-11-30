public class DemoBruch {

    public static void main(String[] args) {

        Bruch b = new Bruch(3, 5);

        Bruch b2 = new Bruch(1,4);
        Bruch b3 = new Bruch(3,4);

        b.print();
        System.out.println("Anzahl Brüche: " + Bruch.getCounter());
        b2.print();
        System.out.println("Anzahl Brüche: " + Bruch.getCounter());
        b3.print();
        System.out.println("Anzahl Brüche: " + Bruch.getCounter());

        Bruch erg = b.multiplicate(b2,b3);
        erg.print();
        System.out.println("Anzahl Brüche: " + Bruch.getCounter());


    }
}
