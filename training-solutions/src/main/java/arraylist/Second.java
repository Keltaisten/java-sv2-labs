package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,9,42,67,4,0,76,14,84,35,92));
        String secondNumbers = "Minden második elem: ";

        for(int i = 1; i < list.size();i+=2){
            secondNumbers += list.get(i) + ", ";
        }
        System.out.println(secondNumbers);
    }
}
