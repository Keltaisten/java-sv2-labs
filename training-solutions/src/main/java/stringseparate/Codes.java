package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codes {
    public String getCodesStartWithLetter(List<String> codes){
        StringBuilder strB = new StringBuilder();
        strB.append("Betűvel kezdődő kódok: ");
        boolean bool = true;
        for(String s: codes){
            if(Character.isAlphabetic(s.charAt(0))){
                if (bool){
                    bool = false;
                }else{
                    strB.append(", ");
                }
                strB.append(s);
            }
        }
        return strB.toString();
    }

    public static void main(String[] args) {
        Codes codes = new Codes();
        List<String> arrayS = new ArrayList<>(Arrays.asList("sad46", "ddedd556", "55fd6df","5d4fd",
        "dkp535", "5f6d6", "opre56df6s"));
        System.out.println(codes.getCodesStartWithLetter(arrayS));
    }
}
