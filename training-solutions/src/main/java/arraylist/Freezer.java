package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> freezerList = new ArrayList<>();

        freezerList.add("Rakott karfiol");
        freezerList.add("Bolognai");
        freezerList.add("Húsleves");
        freezerList.add("Pörkölt");
        freezerList.add("Túrógombóc");

        System.out.println(freezerList.toString());
        System.out.println(freezerList.size());

        freezerList.remove("Bolognai");
        freezerList.remove("Pörkölt");

        System.out.println(freezerList.toString());
        System.out.println(freezerList.size());
    }
}
