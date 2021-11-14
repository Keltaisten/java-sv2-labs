package introexceptiontrycatchtrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorMain calc = new CalculatorMain();
        int i = 0;
        int i2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy számot");
        try {
            i = scanner.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("Nem számot adott meg");
            System.out.println("Az első szám értéke 0 lesz");
        }
        System.out.println("Adjon meg még egy számot");
        try {
            i2 = scanner.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("Nem számot adott meg");
            System.out.println("A második szám értéke 0 lesz");
        }

        System.out.println("Kérem adja meg milyen műveletet szeretne elvégezni (összeadás, kivonás," +
                "szorzás, osztás)");

        scanner.nextLine();
        String operation = scanner.nextLine();
        try {
            calc.doOperations(operation, i, i2);
        }
        catch (ArithmeticException ae){
            System.out.println("Nullával nem lehet osztani");
        }
    }

    private void doOperations(String operation, int i, int i2) {
        Calculator calculator = new Calculator();
        switch(operation){
            case "összeadás":
                System.out.println(calculator.addNumbers(i,i2));
                break;
            case "kivonás":
                System.out.println(calculator.extractNumbers(i,i2));
                break;
            case "szorzás":
                System.out.println(calculator.multiplyNumbers(i,i2));
                break;
            case "osztás":
                System.out.println(calculator.divideNumbers(i,i2));
                break;
            default:
                System.out.println("Rosszul adta meg a műveletet.");
        }
    }
}
