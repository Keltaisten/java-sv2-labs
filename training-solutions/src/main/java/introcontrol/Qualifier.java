package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        int number;
        Scanner scann = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy számot:");
        number = scann.nextInt();

        if(number > 100){
            System.out.println("Nagyobb, mint száz");
        }
        else{
            System.out.println("Száz, vagy kisebb");
        }
    }
}
