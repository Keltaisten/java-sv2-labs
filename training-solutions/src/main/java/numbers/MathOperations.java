package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        double result;
        double resultFromUser;
        Scanner scanner = new Scanner(System.in);
        result = ((1+2)*3.0-2)/7;
        System.out.println("Kérem adja meg a számítás eredményét");
        System.out.println("((1+2)*3.0-2)/7");
        resultFromUser = scanner.nextDouble();
        if(Math.abs(result-resultFromUser)<0.0001){
            System.out.println("A válasz helyes!");
        }else{
            System.out.println("A válasz helytelen.");
        }
    }
}
