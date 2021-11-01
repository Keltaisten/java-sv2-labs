package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String word){
        StringBuilder strB = new StringBuilder();
        strB.append(word.toLowerCase()).reverse();
        if(word.toLowerCase().equals(strB.toString())){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        PalindromeValidator pal = new PalindromeValidator();
        System.out.println(pal.isPalindrome("aSantaLivedAsADevilAtNasa"));
        System.out.println(pal.isPalindrome("Traktor"));
        System.out.println(pal.isPalindrome("Madam"));
    }
}
