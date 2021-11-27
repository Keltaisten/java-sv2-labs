package recursion;

public class Vowels {
    public int getNumberOfVowels(String word){
        String okCharacters = "aáeéiíoóöőuúüű";

            if(isTheLetterInTheStringRecursive(word, okCharacters)){
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
            boolean bool;

            if(okCharacters.charAt(0) == word.charAt(0)){
                return true;
            }
            else{
                if(okCharacters.length() == 1){
                    return false;
                }
                else{
                    bool = isTheLetterInTheStringRecursive(word, okCharacters.substring(1));
                }
            }
            return bool;
        }
    }
