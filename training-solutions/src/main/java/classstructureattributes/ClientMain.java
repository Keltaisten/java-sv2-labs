package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scann = new Scanner(System.in);
        System.out.println("Please give me your name");
        client.name = scann.nextLine();
        System.out.println("Birth");
        client.yearOfBirth = scann.nextInt();
        client.address = scann.nextLine();
        System.out.println("Gimme add");
        client.address = scann.nextLine();
        System.out.println("These are your stuffs: " + client.name + client.yearOfBirth + client.address);
    }
}
