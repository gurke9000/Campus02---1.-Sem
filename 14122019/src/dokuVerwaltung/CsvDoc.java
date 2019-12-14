package dokuVerwaltung;

import java.util.ArrayList;

public class CsvDoc extends Document {

    ArrayList<String> lines;

    public CsvDoc(String fileName, ArrayList<String> lines) {

        super(fileName);
        this.lines=lines;

    }

    public ArrayList<String> getLines() {
        return lines;
    }

    public void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }

    public void addLine (String line)
    {
        lines.add(line);
    }

    @Override
    public void printDoc()
    {
        for(String fileName : lines) {
            System.out.println(fileName + " csv lulul " + "\n");
        }
    }


}
