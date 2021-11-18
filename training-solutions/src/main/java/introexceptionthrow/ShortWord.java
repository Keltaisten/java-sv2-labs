package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add a five character length word");
        String word = scanner.nextLine();

        if(!(word.length()==5)){
            throw new IllegalArgumentException("Not five character length");
        }

        char[] wordChar = word.toCharArray();
        for(Character c: wordChar){
            if(!Character.isAlphabetic(c)){
                throw new IllegalArgumentException("The word contains other characters than alphabetic");
            }
        }
        System.out.println(word);
    }
}
