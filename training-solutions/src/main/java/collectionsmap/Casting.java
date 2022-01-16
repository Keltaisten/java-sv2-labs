package collectionsmap;

import java.util.HashMap;
import java.util.Map;

public class Casting {
    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int minimum = Integer.MAX_VALUE;
        int keyForNext = 0;
        for (Integer actual : applicants.keySet()) {
            int actualMinimum = actual - lastNumber;
            if(actualMinimum < minimum && actualMinimum > 0){
                minimum = actualMinimum;
                keyForNext = actual;
            }
        }
        return applicants.get(keyForNext);
    }

    public static void main(String[] args) {
        Casting casting = new Casting();
        Map<Integer, String> applicants = new HashMap<>();
        applicants.put(77,"John");
        applicants.put(105,"Jane");
        applicants.put(19,"Jack");
        applicants.put(45,"Jetta");
        applicants.put(82,"Joe");
        applicants.put(39,"Johny");

        System.out.println(casting.callNextApplicant(40,applicants));
    }
}
