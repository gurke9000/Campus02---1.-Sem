package dokuVerwaltung;

public abstract class Document {

    protected String fileName;

    public Document(String fileName) {
        this.fileName = fileName;
    }

    public abstract void printDoc();

    public String getFileName() {
        return fileName;
    }
}
