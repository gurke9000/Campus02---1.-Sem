package ooprekursion;

public class Demo1 {

    public static void main(String[] args) {

        Folder haupt1 = new Folder("haupt1");
        Folder haupt2 = new Folder("haupt2");

        Folder sub1 = new Folder("sub1");
        Folder sub2 = new Folder("sub2");
        Folder sub3 = new Folder("sub3");

        File txt1 = new File("text1","txt",10);

        haupt1.addEntry(sub1);
        haupt2.addEntry(sub2);
        sub1.addEntry(sub3);
        sub2.addEntry(txt1);

        haupt1.print();
        haupt2.print();
        System.out.println(haupt1.getSize());
        System.out.println(haupt2.getSize());
    }
}
