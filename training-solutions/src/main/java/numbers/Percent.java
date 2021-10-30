package numbers;

import java.util.Scanner;

public class Percent {
    public double getValue(int number, int percent){
        return (double)number*percent/100;
    }

    public double getBase(int percentOfNumber, int percent){
        return (double)percentOfNumber/percent*100;
    }

    public double getPercent(int number, int percentOfNumber){
        return (double)percentOfNumber/number*100;
    }

    public static void main(String[] args) {
        int number;
        int percent;
        int percentOfNumber;
        Percent per = new Percent();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy számot:");
        number = scanner.nextInt();
        System.out.println("Kérem adjon meg mégegy számot:");
        percent = scanner.nextInt();
        System.out.println("Az első számnak a második szám szerinti százaléka: " + per.getValue(number,percent));
        System.out.println("Kérem adjon meg egy számot:");
        percentOfNumber = scanner.nextInt();
        System.out.println("Kérem adjon meg mégegy számot:");
        percent = scanner.nextInt();
        System.out.println("Az első szám ennek a második szám szerinti százaléka: " + per.getBase(percentOfNumber,percent));
        System.out.println("Kérem adjon meg egy számot:");
        number = scanner.nextInt();
        System.out.println("Kérem adjon meg mégegy számot:");
        percentOfNumber = scanner.nextInt();
        System.out.println("Az elsőnek ennyi százaléka a második: " + per.getPercent(number,percentOfNumber));
    }
}
