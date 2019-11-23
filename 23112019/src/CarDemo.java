public class CarDemo {

    public static void main(String[] args) {

        Car porsche911;
        porsche911 = new Car();
        porsche911.color = "red";
        porsche911.antrieb = "4wd";
        porsche911.leistung = 420;
        porsche911.manufact = "teurer VW";
        porsche911.prodYear = 2020;
        porsche911.co2Output = 400;

        System.out.println("Farbe: " + porsche911.color);


        Car krasser3erBMW = new Car();
        krasser3erBMW.color = "black";
        krasser3erBMW.co2Output = 150;
        krasser3erBMW.prodYear = 2015;
        krasser3erBMW.manufact = "Bayern, des samma mia";
        krasser3erBMW.leistung = 120;
        krasser3erBMW.antrieb = "RWD";
        System.out.println("Hersteller: " + krasser3erBMW.manufact);

    }


}
