package recursion;

import java.util.Arrays;

public class Vowels {
    public int getNumberOfVowels(String word){
//        List<String> okCharacters = Arrays.asList("a")
        String okCharacters = "aáeéiíoóöőuúüű";
//        if(word.length() == 1){
//            return
//        }
        for(char c: okCharacters.toCharArray()){
            if(c == word.charAt(0)){
                if(word.length() == 1){
                    return 1;
                }
                else{
                    return 1 + getNumberOfVowels(word.substring(1,word.length()));
                }
            }else{
                if(word.length() == 1){
                    return 0;
                }
                else{
                    return 0 + getNumberOfVowels(word.substring(1,word.length()));
                }
            }
        }
        return 0;
    }
}