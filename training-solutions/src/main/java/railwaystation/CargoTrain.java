package railwaystation;

public class CargoTrain extends Train{

    public CargoTrain(int numberOfParts) {
        super(numberOfParts);
    }

    @Override
    public int calculateTravellingPeople() {
        int result = Math.round(getNumberOfWagons() / 10);
        return result > 0 ? result : 1;
    }
}
