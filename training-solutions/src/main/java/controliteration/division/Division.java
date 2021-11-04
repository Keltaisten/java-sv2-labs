package controliteration.division;

import java.util.Scanner;

public class Division {
    public StringBuilder divideNumbers(int numbMaximum, int numberFromUser){
        StringBuilder stringNumbers = new StringBuilder();
        int numberOfLoops = 1;
        int numberDividers = numberFromUser;
        boolean bool = true;
        while(numberDividers<numbMaximum){
            if(bool){
                bool = false;
            }else {
                stringNumbers.append(", ");
            }
            stringNumbers.append(numberDividers);
            numberOfLoops++;
            numberDividers = numberFromUser * numberOfLoops;
        }
        return stringNumbers;
    }

    public StringBuilder divideNumbersFor(int numbMaximum, int numberFromUser){
        StringBuilder stringNumbers = new StringBuilder();
        int numberDividers = numberFromUser;
        boolean bool = true;
        for(int i = 2; numberDividers<numbMaximum; i++){
            if(bool){
                bool = false;
            }else {
                stringNumbers.append(", ");
            }
            stringNumbers.append(numberDividers);
            numberDividers = numberFromUser * i;
        }
        return stringNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division division = new Division();
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int numbMaximum = scanner.nextInt();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int numbDivider = scanner.nextInt();
        System.out.println(division.divideNumbers(numbMaximum, numbDivider));
        System.out.println(division.divideNumbersFor(numbMaximum, numbDivider));
    }
}
