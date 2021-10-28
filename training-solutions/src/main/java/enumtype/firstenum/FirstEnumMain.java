package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        for(Continent i: Continent.values()){
            System.out.println(i);
        }
        Continent[] continents = Continent.values();
        System.out.println(Arrays.toString(continents));
    }
}
