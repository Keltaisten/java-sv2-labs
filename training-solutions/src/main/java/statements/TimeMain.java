package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        int hours;
        int minutes;
        int seconds;

        System.out.println("Kérem adjon meg egy időpontot.");
        Scanner scann = new Scanner(System.in);
        System.out.println("Adja meg az órát:");
        hours = scann.nextInt();
        System.out.println("Adja meg a percet:");
        minutes = scann.nextInt();
        System.out.println("Adja meg a másodpercet:");
        seconds = scann.nextInt();

        Time timeFirst = new Time(hours, minutes, seconds);

        System.out.println("Kérem adjon meg egy másik időpontot.");
        System.out.println("Adja meg az órát:");
        hours = scann.nextInt();
        System.out.println("Adja meg a percet:");
        minutes = scann.nextInt();
        System.out.println("Adja meg a másodpercet:");
        seconds = scann.nextInt();

        System.out.println("Az első időpont: " + timeFirst.toString());
        System.out.println("Az első időpont percekben: " + timeFirst.getInMinutes());

        Time timeSecond = new Time(hours, minutes, seconds);
        System.out.println("A második időpont: " + timeSecond.toString());
        System.out.println("A második időpont másodpercekben: " + timeSecond.getInSeconds());

        System.out.println("Az első korábbi? " + timeFirst.earlierThan(timeSecond));
    }
}
