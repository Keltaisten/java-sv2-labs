package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("Kenyér", "Nutella", "Zseblámpa");
        System.out.println(importantThings.toString());
        System.out.println("Meggondoltam magam. Egyet lecserélnék.");
        importantThings.set(2, "Melegszendvics sütő");
        System.out.println("A végleges lista: " + importantThings.toString());
    }
}
