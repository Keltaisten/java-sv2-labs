package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> listOfWords, String word){
        boolean isExistLongerWord = false;
        int step = 0;

        while (!isExistLongerWord && step < listOfWords.size()){
            if(listOfWords.get(step).length() > word.length()){
                isExistLongerWord = true;
            }
            step++;
        }
        return isExistLongerWord;
    }
}
