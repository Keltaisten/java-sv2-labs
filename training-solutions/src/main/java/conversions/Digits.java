package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    List<Integer> intNumbers = new ArrayList<>();

    public void addDigitsToList(String text){
        for(char c: text.toCharArray()){
            if('0' <= c && c <= '9'){
                intNumbers.add(Integer.parseInt(String.valueOf(c)));
            }
        }
    }

    public List<Integer> getIntNumbers() {
        return intNumbers;
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("H3l10, Szi4, Sz3v4sz!");
        System.out.println(digits.intNumbers);
    }
}
