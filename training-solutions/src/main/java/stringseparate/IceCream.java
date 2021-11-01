package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCream {

    public StringBuilder addElements(List<String> arrayS){
        StringBuilder strB = new StringBuilder();
        strB.append("Ma kapható: ");
        boolean bool = true;
        for(String s: arrayS){
            if(bool){
                bool = false;
            }else{
                strB.append(", ");
            }
            strB.append(s);
        }
        strB.append(".\nMa féláron kapható a pisztácia.");
        return strB;
    }

    public static void main(String[] args) {
        IceCream iceCream = new IceCream();
        List<String> arrayS = new ArrayList<>(Arrays.asList("csoki", "vanilia", "puncs", "pisztácia"));
        System.out.println(iceCream.addElements(arrayS).toString());
    }
}
