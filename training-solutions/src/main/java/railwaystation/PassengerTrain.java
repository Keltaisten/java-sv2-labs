package railwaystation;

public class PassengerTrain extends Train{
    private boolean hasDiningCar;
    private static final int NUMBER_OF_PEOPLE_IN_A_PART = 70;

    public PassengerTrain(int numberOfParts) {
        super(numberOfParts);
    }

    public PassengerTrain(String name, int numberOfParts) {
        super(numberOfParts);
        super.name = name;
        this.hasDiningCar = true;
    }

    @Override
    public int calculateTravellingPeople() {
        if(hasDiningCar) {
            return (super.getNumberOfWagons() - 1) * NUMBER_OF_PEOPLE_IN_A_PART;
        }
        else{
            return (super.getNumberOfWagons()) * NUMBER_OF_PEOPLE_IN_A_PART;
        }
    }

    public boolean hasDiningCar() {
        return hasDiningCar;
    }
}
