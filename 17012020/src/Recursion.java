public class Recursion {

    public static void main(String[] args) {

        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(12));

        System.out.println(palindrom("rentner"));
        System.out.println(palindrom("123456754321"));
        System.out.println("nada = " + palindrom(""));
        System.out.println(palindrom("renner"));
    }

    public static int fibonacci (int n)
    {
        if(n == 1 || n == 2)
        {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static boolean palindrom (String s)
    {
        if(s.length() < 2)
        {
            return true;
        }

        char first = Character.toLowerCase(s.charAt(0));
        char last = Character.toLowerCase(s.charAt(s.length()-1));

        if(first != last)
        {
            return false;
        }

        return palindrom(s.substring(1,s.length()-1));
    }


}
