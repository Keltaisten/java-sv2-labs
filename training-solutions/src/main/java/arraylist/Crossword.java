package arraylist;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        String[] block = {"KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ",
                "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA"};
        List<String> list = Arrays.asList(block);
        List<String> modifiedList = new ArrayList<>();
        for(int i = 0; i<list.size();i++){
            if(list.get(i).length()==6){
                modifiedList.add(list.get(i));
            }
        }
        System.out.println(list);
        System.out.println(modifiedList);
    }
}
