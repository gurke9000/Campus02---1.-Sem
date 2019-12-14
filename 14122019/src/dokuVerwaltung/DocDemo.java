package dokuVerwaltung;

import javax.print.Doc;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class DocDemo {
    public static void main(String[] args) {

        PrintManager pm = new PrintManager();

        Document doc1 = new Document("1") {
            @Override
            public void printDoc() {
                System.out.println("lululul es heeeeeeeebt!!!");
            }
        };

        Document doc2 = new TextDoc ("textfile","inhalt");
        Document doc3 = new ImgDoc("img1",10,10,"red");

        CsvDoc doc4 = new CsvDoc("csv", new ArrayList<>());

        doc4.addLine("Zeilen wuhuuu");
        doc4.addLine("noch mehr Zeilen");


        pm.addDoc(doc1);
        pm.addDoc(doc2);
        pm.addDoc(doc3);
        pm.addDoc(doc4);

        pm.printAll();

        Document d = pm.findDoc("1");

        if(d != null)
        {
            d.printDoc();
        }



    }
}
