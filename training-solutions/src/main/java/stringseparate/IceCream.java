package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCream {



    public static void main(String[] args) {
        List<String> arrayS = new ArrayList<>(Arrays.asList("csoki", "vanilia", "puncs", "pisztácia"));
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

        System.out.println(strB.toString());
    }
}
