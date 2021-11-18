package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Validation validation = new Validation();
        boolean bool = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello my friend");
        System.out.println("Whats your name?");
        String name = scanner.nextLine();
        try {
        validation.validateName(name);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
            bool = false;
        }
        System.out.println("Whats your age?");
        String age = scanner.nextLine();
        try {
            validation.validateAge(age);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
            bool = false;
        }

        System.out.println("The given name: " + name);
        System.out.println("The given age: " + age);
        if (bool){
            System.out.println("The registration is valid");
        }else{
            System.out.println("The registration is invalid");
        }
    }
}
