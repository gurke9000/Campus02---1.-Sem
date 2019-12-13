package blackjack;

public class demoBJ {

    public static void main(String[] args) {


        Player p1 = new Player("Mr 1",50);
        Player p2 = new Player("Mr 2",29);
        Player p3 = new Player("Misses 3",76);
        Player p4 = new Player("Misses 21",25);

        Blackjack bj = new Blackjack();
        bj.add(p1);
        bj.add(p2);
        bj.add(p3);
        bj.add(p4);
        bj.add(p1);
        bj.add(p3);

        bj.addCard(p1,15);
        bj.addCard(p2,19);
        bj.addCard(p3,12);
        bj.addCard(p4,13);

        System.out.println(bj.toString());


        System.out.println(bj.getValue(p1));




    }
}
