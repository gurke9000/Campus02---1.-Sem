public class PersonDemo {


        public static void main(String[] args) {

            Person maxMuster = new Person();
            maxMuster.alter = 39;
            maxMuster.vorname = "Max";
            maxMuster.nachname = "Mustermann";

            //System.out.println(maxMuster.vorname + " " + maxMuster.nachname + ", " + maxMuster.alter + " Jahre");

            printPerson(maxMuster);
        }


        public static void printPerson (Person x) {

            System.out.println(x.vorname + " " + x.nachname + ", " + x.alter + " Jahre");

    }
}
