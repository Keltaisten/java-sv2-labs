package stringscanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

















//    public void testScanner(){
//
//    Scanner s = new Scanner(System.in);
//
//    System.out.println("Kérlek, adj meg egy öszetett mondatot!");
//    s.nextLine();
//    List<String> words = new ArrayList<>();
//    int i = 0;
//    while (s.hasNext() && i<20){
//        words.add(s.next());
//        i++;
//    }
////        System.out.println(Arrays.toString(words));
//    }

//    public static void main(String[] args) {
//        StringScanner stringScanner = new StringScanner();
//        System.out.println(stringScanner.testScanner());
////    for(int j =0; s.hasNext() && j<20;j++){
////        words.add(s.next());
////    }
////    System.out.println();
//    }
}
