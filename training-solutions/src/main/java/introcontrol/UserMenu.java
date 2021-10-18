package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        int numb;
        Scanner scann = new Scanner(System.in);

        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");

        numb = scann.nextInt();

        if(numb == 1){
            System.out.println("Felhasználók listázása");
        }
        if(numb == 2){
            System.out.println("Felhasználó felvétele");
        }
    }
}
