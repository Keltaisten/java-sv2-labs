package introcontrol;

import java.util.Scanner;

public class BootRental {
    public static void main(String[] args) {
        int number;

        Scanner scann = new Scanner(System.in);

        System.out.println("Kérem adja meg hányan vennék igénybe a kölcsönzést");
        number = scann.nextInt();

        numbers(number);
    }

    public static void numbers(int numb){
        String taken = "Az elvitt csónak/csónakok: ";
        int remain = 10;
        String place;

        if(numb>10){
            place = "és nincs több szabad hely. Maradtak még a parton.";
        }
        else{
            place = "és nincs több szabad hely.";
        }


        if(numb>5){
            numb -= 5;
            remain -=5;
            taken = taken + "5-ös, ";
            if(numb/3 > 0){
                numb -= 3;
                remain -=3;
                taken = taken + "3-as, ";
            }

            if(numb > 0){
                numb -= 2;
                remain -= 2;
                taken = taken + "2-es, ";
            }
        }
        else{
            if(numb/4 > 0){
                numb -= 5;
                remain -=5;
                taken = taken + "5-ös, ";
            }

            if(numb/3 > 0){
                numb -= 3;
                remain -=3;
                taken = taken + "3-as, ";
            }

            if(numb > 0){
                numb -= 2;
                remain -= 2;
                taken = taken + "2-es, ";
            }
        }

        if(remain == 0){
            System.out.println(taken + place);
        }
        else{
            System.out.println(taken + "és " + remain + " fő mehet még utánuk.");
        }

    }
}
