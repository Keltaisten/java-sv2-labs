package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberString = "0";
        System.out.println("Please write a positive whole number");

        numberString = scanner.nextLine();

        char[] charArray = numberString.toCharArray();
        for(char c: charArray){
            if(!Character.isDigit(c)){
                throw new IllegalArgumentException(numberString + " is Not a positive number");
            }
        }
        if(Integer.parseInt(numberString)==0){
            throw new IllegalArgumentException(numberString + " is Not a positive number");
        }

    }
}
