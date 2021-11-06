package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy pozitív egész számot");
        Integer number = scanner.nextInt();

        for(Integer i = number; i < 200;i++){
            Integer data = Integer.parseInt(String.valueOf(i.toString().toCharArray()[i.toString().toCharArray().length-1])) ;
//            boolean bool = data == number;
            if(i %number == 0){
                System.out.println("x");
            }else if(i %number != 0 && data == number){
//            }else if(i %7 != 0 && i.toString().toCharArray()[i.toString().toCharArray().length-1] == 7){
                break;
            }else{
            System.out.println(i);
            }
//            System.out.println("some: " + i.toString().toCharArray()[i.toString().toCharArray().length-1]);
//            System.out.println("some: " + data);
//            System.out.println(bool);
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
