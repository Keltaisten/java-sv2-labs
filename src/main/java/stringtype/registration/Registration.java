package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        UserValidator userVal = new UserValidator();
        Scanner scann = new Scanner(System.in);

        System.out.println("Ez egy regisztráció a facebookra.");
        System.out.println("Kérem adja meg a felhasználónevét:");
        userVal.setUsername(scann.nextLine());
        System.out.println("Kérem adjon meg egy jelszót:");
        userVal.setPassword1(scann.nextLine());
        System.out.println("Kérem írja be újraa jelszót:");
        userVal.setPassword2(scann.nextLine());
        System.out.println("Kérem adja meg az e-mail címét:");
        userVal.setEmail(scann.nextLine());

        System.out.println("A megadott felhasználónév: " + (userVal.isValidUsername(userVal.username)? "Helyes": "Helytelen"));
        System.out.println("A megadott jelszó: " + ((userVal.isValidPassword(userVal.password1, userVal.password2))? "Helyes": "Helytelen"));
        System.out.println("A megadott e-mail cím: " + (userVal.isValidEmail(userVal.email)? "Helyes": "Helytelen"));
    }
}
