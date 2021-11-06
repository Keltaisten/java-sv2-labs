package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy pozitív egész számot");
        int number = scanner.nextInt();

        for(Integer i = number; i >= number;i++){
            if(i %7 == 0){
                System.out.println("x");
                continue;
            }else if(Integer.toString(i).contains("7")){
                break;
            }
            System.out.println(i);
        }
    }
}
