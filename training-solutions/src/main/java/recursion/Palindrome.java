package recursion;

public class Palindrome {
    public boolean isPalindrome(String word){
        if(word.length() <= 1){
            return true;
        }
        else if(word.charAt(0) == word.charAt(word.length() - 1)){
            if(word.length() == 2){
                return true;
            }
            else{
                return isPalindrome(word.substring(1, word.length() - 1));
            }
        }
        else{
            return false;
        }
    }
}
