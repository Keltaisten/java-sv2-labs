package conventions;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Kérem adja meg az autója típusát.");
        String carType = scann.nextLine();

        System.out.println("Kérem adja meg a motor típusát.");
        String engineType = scann.nextLine();

        System.out.println("Kérem adja meg az ajtók számát");
        int doors = scann.nextInt();

        System.out.println("Kérem adja meg a szállítható emberek számát");
        int persons = scann.nextInt();

        Car car = new Car(carType, engineType, doors, persons);

        System.out.println("Az ön autójának az adatai. Autó típus: " + car.getCarType() + ", Motor típus: "  + car.getEngineType() + ", Ajtók száma: " + car.getDoors() + ", Szállítható személyek száma: " + car.getPersons());

        System.out.println("Kérem adja meg a gépjármű típusának modelljét.");
        scann.nextLine();
        String model = scann.nextLine();

        car.addModelName(model);

        System.out.println("Az ön gépjárműjének a típusa és modellje: " + car.getCarType());

    }
}
