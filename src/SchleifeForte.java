public class SchleifeForte {

    public static void main(String[] args) {


        long x = 13;

        for(int i = 2; i<10 ;i++)
        {
            System.out.println(x + " * " + i);
            x *= i;
        }

        for(int i = 2; i<10 ;i++)
        {
            System.out.println(x + " / " + i);
            x /=  i;
        }

        System.out.println(x);
    }
}
