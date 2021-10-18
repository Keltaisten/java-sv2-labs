package introcontrol;

import java.util.Scanner;

public class BootRental {
    public static void main(String[] args) {
        int number;


        numbers(1);
        numbers(2);
        numbers(3);
        numbers(4);
        numbers(5);
        numbers(6);
        numbers(7);
        numbers(8);
        numbers(9);
        numbers(10);

    }


    public void soutLines(int number){
        System.out.println(number + " vitték el.");
        System.out.println(10 - number + " fő mehet még utánuk.");
    }

    public static void numbers(int numb){
        int boat5 = 0;
        int boat3 = 0;
        int boat2 = 0;
        int remain = 10;

        if(numb>5){
            numb -= 5;
            remain -=5;
            boat5 = 1;
            if(numb/3 > 0){
                numb -= 3;
                remain -=3;
                boat3= 1;
            }

            if(numb > 0){
                numb -= 2;
                remain -= 2;
                boat2 = 1;
            }
        }
        else{
            if(numb/4 > 0){
                numb -= 5;
                remain -=5;
                boat5 = 1;
            }

            if(numb/3 > 0){
                numb -= 3;
                remain -=3;
                boat3= 1;
            }

            if(numb > 0){
                numb -= 2;
                remain -= 2;
                boat2 = 1;
            }
        }


        System.out.println("5 személyes : " + boat5 + ", 3 személyes :" + boat3 + ", 2 személyes: " + boat2
                + ", Férőhely maradt: " + remain);
    }


}
