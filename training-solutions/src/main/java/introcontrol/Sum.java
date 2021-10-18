package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scann = new Scanner(System.in);

        for(int i = 0;i<5;i++){
            System.out.println("Kérem adjon meg egy számot:");
            sum += scann.nextInt();
        }

        System.out.println("Számok összege: " + sum);
    }
}
