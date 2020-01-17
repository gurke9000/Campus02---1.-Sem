package orchester;

public class Klarinette extends Instrument {

    public Klarinette(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        return lautstaerke;
    }
}
