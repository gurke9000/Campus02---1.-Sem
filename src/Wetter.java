public class Wetter {

    public static void sagWetter(String weather){
        System.out.println("The weather is " + weather);
    }


    public static String buildweathertext(String weather){

        return "The weather is " + weather;
    }


    public static void main(String [] args){

        sagWetter("fine");

        String condition = "meh";
        sagWetter(condition);

        buildweathertext(condition);



    }
}
