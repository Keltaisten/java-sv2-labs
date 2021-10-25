package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    
    public static void main(String[] args) {
        String surName;
        String firstName;
        int yearOfBirth;
        int monthOfBirth;
        int dayOfBirth;
        String email;

        Registration registration = new Registration();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a vezetéknevét");
        surName = scanner.nextLine();
        System.out.println("Kérem adja meg a keresztnevét");
        firstName = scanner.nextLine();
        System.out.println("Teljes név: " + registration.concName(surName,firstName));
        System.out.println("Kérem adja meg a születési évet");
        yearOfBirth = scanner.nextInt();
        System.out.println("Kérem adja meg a születési hónapot");
        monthOfBirth = scanner.nextInt();
        System.out.println("Kérem adja meg a születési napot");
        dayOfBirth = scanner.nextInt();
        System.out.println("Kérem adja meg az e-mail címét");
        scanner.nextLine();
        email = scanner.nextLine();

        Person person = new Person(registration.concName(surName,firstName),registration.concDate(yearOfBirth,monthOfBirth,dayOfBirth),email );
        System.out.println(person.toString());
    }

    public String concName(String surName, String firstName){
        return surName + " " + firstName;
    }

    public LocalDate concDate(int yearOfBirth, int monthOfBirth, int dayOfBirth){
        return LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
    }
}
