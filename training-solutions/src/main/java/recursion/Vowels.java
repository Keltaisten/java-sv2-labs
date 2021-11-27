package recursion;

import java.util.Arrays;

public class Vowels {
    public int getNumberOfVowels(String word){
//        List<String> okCharacters = Arrays.asList("a")
        String okCharacters = "aáeéiíoóöőuúüű";
//        if(word.length() == 1){
//            return
//        }

//            System.out.println(c);
//            System.out.println(word.charAt(0));
            if(isTheLetterInTheString(word)){
                if(word.length() == 1){
                    return 1;
                }
                else{
                    return 1 + getNumberOfVowels(word.substring(1));
                }
            }else{
                if(word.length() == 1){
                    return 0;
                }
                else{
                    return 0 + getNumberOfVowels(word.substring(1));
                }
            }
    }


    public boolean isTheLetterInTheString(String word){
        String okCharacters = "aáeéiíoóöőuúüű";
        for(char c: okCharacters.toCharArray()){

            if(c == word.charAt(0)){
                return true;
                }
            }
        return false;
        }

    public boolean isTheLetterInTheStringRecursive(String word, String okCharacters){

        for(char c: okCharacters.toCharArray()){

            if(c == word.charAt(0)){
                return true;
            }
        }
        return false;
    }
    }
