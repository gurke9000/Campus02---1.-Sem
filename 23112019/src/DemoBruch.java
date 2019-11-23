public class DemoBruch {

    public static void main(String[] args) {

        Bruch b = new Bruch(3, 5);

        Bruch b2 = new Bruch(1,4);
        Bruch b3 = new Bruch(3,4);

        b.print();
        b2.print();
        b3.print();

        Bruch erg = b.multiplicate(b2,b3);
        erg.print();


    }
}
