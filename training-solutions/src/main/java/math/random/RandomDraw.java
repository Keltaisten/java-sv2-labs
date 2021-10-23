package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> members = new ArrayList<>(Arrays.asList("Pisti", "Olga", "Sándor", "Gabi", "Bandi",
                "Vali", "Holli", "Fiona", "Leona", "Imola"));

        Random rand = new Random();
        int random1= rand.nextInt(0,4);
        int random2= rand.nextInt(5,9);

        System.out.println("Az első nyertesünk: " + members.get(random1));
        System.out.println("A második nyertes: " + members.get(random2));
    }
}
