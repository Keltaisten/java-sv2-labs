package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance(500.123, true);

        System.out.println("A mért távolság a következő: " + distance.getDistanceInKm() + ", A mérés hibamentes volt? " + distance.isExact());

        int partOfDistance = (int) distance.getDistanceInKm();
        System.out.println("A távolság egész része: " + partOfDistance);
    }

}
