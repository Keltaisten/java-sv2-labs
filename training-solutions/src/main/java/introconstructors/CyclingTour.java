package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String decription;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String decription, LocalDate startTime) {
        this.decription = decription;
        this.startTime = startTime;
    }

    public void registerPerson(int person){
        numberOfPeople += person;
    }

    public void ride(double km){
        kms += km;
    }

    public String getDecription() {
        return decription;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Velence túra", LocalDate.of(2021,11,05));
        System.out.println("A túra leírása: " + cyclingTour.getDecription());
        System.out.println("A túra kezdő dátuma: " + cyclingTour.getStartTime());
        System.out.println("A túrázó csapat létszáma: " + cyclingTour.getNumberOfPeople());
        System.out.println("A túrán megtett kilóméterek: " + cyclingTour.getKms());

        cyclingTour.registerPerson(2);
        cyclingTour.registerPerson(5);
        cyclingTour.registerPerson(4);

        cyclingTour.ride(10);
        cyclingTour.ride(12);
        cyclingTour.ride(15);

        System.out.println("A túra leírása: " + cyclingTour.getDecription());
        System.out.println("A túra kezdő dátuma: " + cyclingTour.getStartTime());
        System.out.println("A túrázó csapat létszáma: " + cyclingTour.getNumberOfPeople());
        System.out.println("A túrán megtett kilóméterek: " + cyclingTour.getKms());

    }
}
