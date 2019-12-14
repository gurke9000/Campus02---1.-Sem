package dokuVerwaltung;

public class TextDoc extends Document {

    private String content;

    public TextDoc(String fileName, String content) {
        super(fileName);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void printDoc() {
        System.out.println(fileName + " ich bin ein textdoc " + content);
    }


}



