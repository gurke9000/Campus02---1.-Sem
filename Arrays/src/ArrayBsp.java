public class ArrayBsp {

    public static void main(String[] args) {

        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec"};

        for (int t = 0; t <= months.length;t++){
            System.out.println(months[t] + " ["+ (t+1) +"]");
        }
    }

}
