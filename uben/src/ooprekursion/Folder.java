package ooprekursion;

import java.util.ArrayList;

public class Folder extends FSEntry {

    private ArrayList<FSEntry> entries = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }


    public void addEntry(FSEntry entry)
    {
        if(!entries.contains(entry))
        entries.add(entry);
    }

    @Override
    public int getSize() {
        int size = 0;
        for(FSEntry f: entries)
        {
            size += f.getSize();
        }
        return size;
    }


    @Override
    public void print() {
        System.out.println(getName());
        for (FSEntry f : entries)
        {
            f.print();
           // System.out.println(f.getName() + "\n"); f.print();
        }

    }

    @Override
    protected void printDir(String indent) {
        System.out.println(indent + getName());

        for(FSEntry f: entries)
        {
            f.printDir( "   ");
        }


    }
}
