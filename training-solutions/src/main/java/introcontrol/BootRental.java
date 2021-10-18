package introcontrol;

import java.util.Scanner;

public class BootRental {
    public static void main(String[] args) {
        int number;

        Scanner scann = new Scanner(System.in);

        System.out.println("Kérem adja meg hányan vennék igénybe a kölcsönzést");
        //number = scann.nextInt();
        number = 5;
        if (number <= 2) {
            System.out.println(number + " vitték el.");
            System.out.println(10 - number + " fő mehet még utánuk.");
        } else {
            if (number == 3) {
                System.out.println(number + " vitték el.");
                System.out.println(10- number + " fő mehet még utánuk.");
            } else {
                if (number <= 5) {
                    System.out.println(number + " vitték el.");
                    System.out.println(10 - number +" fő mehet még utánuk.");
                } else {
                    if (number <= 7) {
                        System.out.println(number + " vitték el.");
                        System.out.println(10 - number + " fő mehet még utánuk.");
                    } else {
                        if (number <= 8) {
                            System.out.println(number + " vitték el.");
                            System.out.println(10 - number +" fő mehet még utánuk.");
                        }else {
                            if (number <= 10) {
                                System.out.println(number + " vitték el.");
                                System.out.println(10 - number +" fő mehet még utánuk.");
                            }
                        }
                    }

                }
            }
        }




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
        boolean boat5 = false;
        boolean boat3 = false;
        boolean boat2 = false;
        int remain = 10;
        int originalNumber = numb;

        if(numb>5){
            numb -= 5;
            remain -=5;
            boat5 = true;
            if(numb/3 > 0){
                numb -= 3;
                remain -=3;
                boat3= true;
            }

            if(numb > 0){
                numb -= 2;
                remain -= 2;
                boat2 = true;
            }
        }
        else{
            if(numb/4 > 0){
                numb -= 5;
                remain -=5;
                boat5 = true;
            }

            if(numb/3 > 0){
                numb -= 3;
                remain -=3;
                boat3= true;
            }

            if(numb > 0){
                numb -= 2;
                remain -= 2;
                boat2 = true;
            }
        }


        System.out.println("Csapat létszáma: " + originalNumber + ", 5 személyes : " + boat5 +
                ", 3 személyes :" + boat3 + ", 2 személyes: " + boat2
                + ", Férőhely maradt: " + remain);
    }

    public static void numbers2(int numb) {

    }

}
