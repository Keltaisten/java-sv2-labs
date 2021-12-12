package interfacerules;

public class Equator implements Name, Length{
    private static final String NAME = "Equator";
    private static final double length = 40_075;


    @Override
    public double getLength() {
        return length;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
