public class BankDemo {

    public static void main(String[] args) {

        Konto k1 = new Konto("Lukas");
//        k1.setInhab("Lukas");
        Konto k2 = new Konto("Andy");
//        k2.setInhab("Andy");

        printKonto(k1);
        printKonto(k2);

        k1.aufbuchen(800);
        k2.aufbuchen(270);

        printKonto(k1);
        printKonto(k2);

        k1.abbuchen(1000);
        k2.abbuchen(30);
    }

    public static void printKonto(Konto x) {
        System.out.println("Kontoinhaber: " + x.getInhab() + " - Kontostand: " + x.getStand());
    }

}
