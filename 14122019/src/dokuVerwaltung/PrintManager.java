package dokuVerwaltung;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrintManager {

    private ArrayList<Document> docs = new ArrayList<>();

    public void addDoc(Document d)
    {
        docs.add(d);
    }

    public void printAll()
    {
        for(Document d: docs)
        {
            d.printDoc();
        }
    }

    public Document findDoc(String name)
    {
        for(Document d : docs)
        {
            if(d.fileName.equals(name))
            {
                return d;
            }
        }
        return null;
    }
}
