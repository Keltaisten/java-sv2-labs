package stringscanner;

import java.util.Scanner;

public class IntScanner {
    public String convertInts(String ints){
        Scanner scannerInt = new Scanner(ints).useDelimiter(";");
        StringBuilder strB = new StringBuilder();
        String scannerIntValue;
        strB.append("");
        boolean bool = true;
        while(scannerInt.hasNext()){
            scannerIntValue = scannerInt.next();
            if(Integer.parseInt(scannerIntValue)>100){
                if(bool){
                    bool = false;
                }
                else{
                    strB.append(",");
                }
                System.out.println(scannerIntValue);
                strB.append(scannerIntValue);
            }
        }
        return strB.toString();
    }

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();
        System.out.println("Kérem adjon meg pár számot pontosvesszővel elválasztva. Köszönöm!");
        Scanner scannerSystem = new Scanner(System.in);
        String input =scannerSystem.nextLine();
        System.out.println(intScanner.convertInts(input));
    }
}
