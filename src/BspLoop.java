public class BspLoop {

    public static void main(String[] args) {

        int T = 3;
        int Z = 2;
      //int Z = T - 1;
        boolean hatTeiler = false;

        while (T > Z) {
      //while (T > 1)
            if(T % Z == 0) {
                System.out.println(Z + " ist ein Teiler von " + T);
                hatTeiler = true;
            }
            Z++;
      //T -= 1;
        }
        if(!hatTeiler) {
            System.out.println("lol, primzahl");
        }
    }
}
