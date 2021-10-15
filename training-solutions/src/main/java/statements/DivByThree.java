package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        int numb;
        boolean bool;
        Scanner scann = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy számot:");
        numb = scann.nextInt();
        bool = numb % 3 > 0;
        System.out.println(bool ? "Nem osztható hárommal.": "Osztható hárommal.");
    }
}
