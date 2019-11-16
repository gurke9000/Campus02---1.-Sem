public class Distance {

    public static double km2LM(double km) {

        double miles = km * 0.6214;
        return miles;

        //return km * 0.6214;

    }

    public static double LM2KM(double km) {

        double miles = km / 0.6214;
        return miles;

        //return km * 0.6214;

    }

    public static void main(String[] args) {

        double km1 = 100.0;
        double miles1 = km2LM(km1);
        System.out.println(km1 + " Kilometer sind " + miles1 + "Landmeielen");

        double miles2 = 65.7;
        double km2 = LM2KM(miles2);
        System.out.println(miles2 + " Landmeilen sind " + km2 + "Kilometer");

    }


}
