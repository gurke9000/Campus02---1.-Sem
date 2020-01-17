package orchester;

public abstract class Instrument {

    protected int lautstaerke;

    public Instrument(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }


    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public abstract int play();

}
