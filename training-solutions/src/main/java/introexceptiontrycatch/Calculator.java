package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int i = 0;
        int i2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy számot");
        try {
        i = scanner.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("Nem számot adott meg");
        }
        System.out.println("Adjon meg még egy számot");
        try {
            i2 = scanner.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("Nem számot adott meg");
        }

//        System.out.println(i);
//        System.out.println(i2);

        System.out.println("Kérem adja meg milyen műveletet szeretne elvégezni (összeadás, kivonás," +
                "szorzás, osztás)");

        scanner.nextLine();
        String operation = scanner.nextLine();

        calculator.doOperations(operation, i, i2);
    }

    private void doOperations(String operation, int i, int i2) {
        switch(operation){
            case "összeadás":
                System.out.println(i + i2);
                break;
            case "kivonás":
                System.out.println(i - i2);
                break;
            case "szorzás":
                System.out.println(i * i2);
                break;
            case "osztás":
                System.out.println(i / i2);
                break;
            default:
                System.out.println("Rosszul adta meg a műveletet.");
        }
    }
}
