package orchester;

public class Trompete extends Instrument {

    public Trompete(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        return lautstaerke;
    }
}
