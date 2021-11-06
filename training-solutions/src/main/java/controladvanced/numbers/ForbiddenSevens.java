package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy pozitív egész számot");
        Integer number = scanner.nextInt();

        for(int i = number; i < i*10;i++){
            if(number %7 == 0){
                System.out.println(i);
            }else if(number %7 != 0 && number.toString().toCharArray()[number.toString().toCharArray().length-1] == 7){
                break;
            }
            System.out.println(i);
        }

//        while(number %7 != 0 && number.toString().toCharArray()[number.toString().toCharArray().length-1] == 7){
//            if(number %7 == 0){
//
//            }
//
//        }
//        while(number %7 == 0 && Character.toChars(number)[0] == 0);


    }
}
