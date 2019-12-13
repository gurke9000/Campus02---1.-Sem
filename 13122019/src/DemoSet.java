import java.util.HashSet;

public class DemoSet {

    public static void main(String[] args) {
        Movie m1 = new Movie("lol",200,2000,"scifi");
        Movie m2 = new Movie("HdR",300,2001,"hifantasy");
        Movie m3 = new Movie("F&F",120,2003,"vroom");
        Movie m4 = new Movie("JW",123,2009,"shooties");
        Movie m5 = new Movie("barry trotter",150,2007,"zauberstab");

        HashSet<Movie> ich = new HashSet<>();
        ich.add(m1);
        ich.add(m3);
        ich.add(m3);
        // Fügt er nicht öfters hinzu, weil die Equals & Hash-Code-Methoden dies nicht zu lassen.


        System.out.println("ich = " + ich);

        HashSet<Movie> du = new HashSet<>();
        du.add(m2);
        du.add(m3);
        du.add(m4);
        du.add(m5);


        System.out.println("du = " + du);

        Cineast p1 = new Cineast("ich",ich);
        HashSet<Movie> watchedP1 = p1.getWatched();

        Cineast p2 = new Cineast("du",du);
        HashSet<Movie> watchedP2 = p2.getWatched();

        HashSet<Movie> intersection = new HashSet<>();
        intersection.addAll(watchedP1);

        HashSet<Movie> union = new HashSet<>();
        union.addAll(watchedP1);


        intersection.retainAll(watchedP2);
        //Schnittmenge

        union.addAll(watchedP2);
        //Union

        System.out.println("intersection = " + intersection);
        System.out.println("union = " + union);
        System.out.println(union.size());
        


    }
}
