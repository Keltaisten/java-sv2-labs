package statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {
        int fund;
        int interestRate;
        double days;

        Scanner scann = new Scanner(System.in);

        System.out.println("Kérem adja meg a befektetni kívánt összeget:");
        fund = scann.nextInt();
        System.out.println("Kérem adja meg a kamatlábat:");
        interestRate = scann.nextInt();

        Investment investment = new Investment(fund, interestRate);

        System.out.println("Az ön tőkéje: " + investment.getFund());
        System.out.println("Kérem adja meg hány napra szeretné tudni a hozamot");
        days = scann.nextInt();
        System.out.println("Az ön hozama ha " + days + " nap után veszi ki a pénzét: " + investment.getYield(days));
        System.out.println("Ön 80 nap után vette ki a befektetését ennek összege: " + investment.close(80.0));
        System.out.println("A befektetés 90 nap után: " + investment.close(90.0));

    }
}
