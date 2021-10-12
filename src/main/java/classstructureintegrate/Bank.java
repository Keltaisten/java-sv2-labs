package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Kérlek adja meg a számla számát:");
        String accountNb = scann.nextLine();
        System.out.println("Kérlek adja meg a nevét:");
        String owner = scann.nextLine();
        System.out.println("Kérlek adja meg befizetni kívánt összeget:");
        int balance = scann.nextInt();

        BankAccount bankAccount = new BankAccount(accountNb, owner, balance);


        System.out.println("Az ön nyitó számlája: " + bankAccount.getInfo());

        bankAccount.deposit(500);
        bankAccount.withdraw(1200);

        System.out.println("Az ön hó végi számlája: " + bankAccount.getInfo());


    }
}
