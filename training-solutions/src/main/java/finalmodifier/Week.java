package finalmodifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week {
            //Ezt final static-tól függetlenül is lehet módosítani, növelni csökkenteni.
//        public final static List<String> DAYS_OF_WEEK = new ArrayList<>(Arrays.asList("Hetfő", "Kedd", "Szerda",
//        "Csütörtök", "Péntek", "Szombat", "Vasárnap"));
            //Ezt final static nélkül sem lehetne növelni csökkenteni. Módosítani lehet.
        public final static List<String> DAYS_OF_WEEK = Arrays.asList("Hetfő", "Kedd", "Szerda",
        "Csütörtök", "Péntek", "Szombat", "Vasárnap");
    public static void main(String[] args) {
        //Tömbbő készített listán nem lehet az elemek számát növelni csökkenteni. Módosítani lehet. Mindet lehet.
//        List<String> DAYS_OF_WEEK = Arrays.asList("Hetfő", "Kedd", "Szerda",
//        "Csütörtök", "Péntek", "Szombat", "Vasárnap");
        DAYS_OF_WEEK.set(1,"Szerda");
        DAYS_OF_WEEK.add("Hello there");
        System.out.println(DAYS_OF_WEEK.get(1));
        System.out.println(DAYS_OF_WEEK);
    }
}
