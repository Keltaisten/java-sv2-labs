package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Please give me two numbers:");
        Scanner scann = new Scanner(System.in);
        int firstNumb = scann.nextInt();
        int secondNumb = scann.nextInt();
        System.out.println(firstNumb + " + " + secondNumb);
        System.out.println(firstNumb + secondNumb);

    }
}
