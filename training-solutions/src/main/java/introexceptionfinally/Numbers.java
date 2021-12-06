package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public void askForNumbers(){
        boolean isItOdd = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kérem adjon meg egy számot");
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if(number%2 == 0){
                  isItOdd = false;
                }
            }catch (NumberFormatException nfe){
                throw new IllegalArgumentException("You didnt give a digit", nfe);
            }
            finally {
                System.out.println("End of round.");
            }

        }while(isItOdd);
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.askForNumbers();
    }
}
