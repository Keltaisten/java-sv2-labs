package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();
        Scanner scann = new Scanner(System.in);

        System.out.println("Kérem ossza meg velünk mi a kedvenc filmje:");
        favouriteThings.add(scann.nextLine());
        System.out.println("Kérem írja meg mi a kedvenc könyve:");
        favouriteThings.add(scann.nextLine());
        System.out.println("Kérem adja meg mi a kedvenc játéka:");
        favouriteThings.add(scann.nextLine());

        System.out.println("Lista mérete: " + favouriteThings.size() + ", Lista tartalma: " + favouriteThings.toString());
    }
}
