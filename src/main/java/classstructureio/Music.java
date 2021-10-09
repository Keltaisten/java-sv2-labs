package classstructureio;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song songs = new Song();
        Scanner scann = new Scanner(System.in);
        System.out.println("Énekes");
        songs.band = scann.nextLine();
        System.out.println("Dal");
        songs.title = scann.nextLine();
        System.out.println("Hossz");
        songs.length = scann.nextInt();
        System.out.println(songs.band + " - " + songs.title + " (" + songs.length + " perc)");
    }
}
