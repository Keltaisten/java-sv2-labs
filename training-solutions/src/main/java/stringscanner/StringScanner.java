package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {
        Scanner scannerSystem = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy összetett mondatot");
        String strSystem = scannerSystem.nextLine();

        Scanner scannerStr = new Scanner(strSystem);

        while (scannerStr.hasNext()){
            System.out.println(scannerStr.next());
        }

        System.out.println("Kérem adjon meg mégegy összetett mondatot");
        String strSystem2 = scannerSystem.nextLine();

        Scanner scannerStr2 = new Scanner(strSystem2).useDelimiter(", ");

        while(scannerStr2.hasNext()){
            System.out.println(scannerStr2.next());
        }
    }
}
