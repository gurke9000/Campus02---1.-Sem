package staat;

public class Bundesland extends Land {

    private double BSP;

    public Bundesland(double BSP)
    {
        this.BSP = BSP;
    }

    @Override
    public double getBSP() {
        return BSP;
    }
}
