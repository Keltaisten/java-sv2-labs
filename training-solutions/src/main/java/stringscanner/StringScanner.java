package stringscanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy összetett mondatot");
        String str = scann.nextLine();
        Scanner scann2 = new Scanner(str);
        List<String> list = new ArrayList<>();
        while (scann2.hasNext()){
            list.add(scann2.next());
        }
        System.out.println(list);
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
