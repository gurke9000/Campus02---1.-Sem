package orchester;

public class Gitarre extends Instrument {

    public Gitarre(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        return lautstaerke;
    }
}
