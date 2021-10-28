package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        for(Continent i: Continent.values()){
            System.out.println(i);
        }
        Continent[] continents = Continent.values();
        System.out.println(Arrays.toString(continents));

        System.out.println(Ocean.valueOf("CSENDESÓCEÁN"));
        System.out.println(Ocean.valueOf("ATLANTIÓCEÁN"));
        System.out.println(Ocean.valueOf("INDIAIÓCEÁN"));

        System.out.println(Football.HÁTVÉD.name());
        System.out.println(Football.CSATÁR.name());
        System.out.println(Football.KAPUS.name());
        System.out.println(Football.KÖZÉPPÁLYÁS.name());
        System.out.println(Football.VÉDŐ.name());
    }
}
