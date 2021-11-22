package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    private List<Person> personList = new ArrayList<>();
    private List<String> personListString = new ArrayList<>();

    public static void main(String[] args) {
        Birthday birthday = new Birthday();
        System.out.println("Kérem adja meg a barátai vagy családtagjai nevét és születési dátumát" +
                "\nElsőnek adja meg hány adatot kíván rögzíteni");
        birthday.getTheNamesAndBirthdays();
        birthday.convertPersonToString();
        birthday.addToFile();
    }

    private void convertPersonToString() {
        for(Person p: personList){
            personListString.add(p.toString());
        }
    }

    private void getTheNamesAndBirthdays() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < number; i++){
            System.out.println("Név:");
            String name = scanner.nextLine();
            System.out.println("Szűletési év:");
            int dateOfBirth = scanner.nextInt();
            scanner.nextLine();
            personList.add(new Person(name, dateOfBirth));
        }

    }

    private void addToFile() {
        try {
            Files.write(Paths.get("src/main/resources/birthday.txt"), personListString);
        }catch (IOException ioe){
            throw new IllegalStateException("File not found", ioe);
        }
    }
}
