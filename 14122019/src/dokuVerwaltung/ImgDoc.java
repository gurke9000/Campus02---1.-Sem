package dokuVerwaltung;

public class ImgDoc extends Document {

    private int sizeX;
    private int sizeY;
    private String color;

    public ImgDoc(String fileName, int sizeX, int sizeY, String color) {
        super(fileName);
        this.color=color;
        this.sizeX=sizeX;
        this.sizeY=sizeY;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void printDoc() {
        System.out.println(fileName + " haha, imgur");
    }
}
