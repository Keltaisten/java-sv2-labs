package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {
    public List<String> getFirstTwoLeters(List<String> listOfWords){
        List<String> transformedList = new ArrayList<>();
        for(String s: listOfWords){
            transformedList.add(s.substring(0,2));
        }
        return transformedList;
    }
}
