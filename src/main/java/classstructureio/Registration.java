package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Please give me your name");
        String name = scann.nextLine();
        System.out.println("Please give me your e-mail address and money");
        String email = scann.nextLine();
        System.out.println("This is your name: " + name + " and this is your e-mail address: " + email + " ( and here is the money! :) )");
    }
}
