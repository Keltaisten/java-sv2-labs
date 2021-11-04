package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words= new ArrayList<>();

    public void addWord(String word){
        words.add(word);
    }

    public void getWordsStartWith(String prefix){
        List<String> removeFromList = new ArrayList<>();
        for(String s: words){
            if(!s.startsWith(prefix)){
                removeFromList.add(s);
            }
        }
        words.removeAll(removeFromList);
    }

    public void getWordsWithLength(int length){
        List<String> removeFromList = new ArrayList<>();
        for(String s: words){
            if(s.length() != length){
                removeFromList.add(s);
            }
        }
        words.removeAll(removeFromList);
    }

    public List<String> getWords() {
        return words;
    }
}
