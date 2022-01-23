package railwaystation;

public abstract class Train {
    protected String name;
    private int numberOfWagons;
    public static final int LENGTH_OF_WAGON = 15;

    public Train(int numberOfParts) {
        this.numberOfWagons = numberOfParts;
    }

    public int getTotalLength(){
        return numberOfWagons * LENGTH_OF_WAGON;
    }

    public abstract int calculateTravellingPeople();

    public String getName() {
        return name;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }
}
