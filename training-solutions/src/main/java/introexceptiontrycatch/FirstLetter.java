package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstLetter {
    ArrayList<String> words = new ArrayList<>(Arrays.asList("alma", "kifli", "szekrény", "monitor"));

    public void writeAllTheWords(){
        for(int i = 0; i <= words.size();i++){
            try {
            System.out.println(words.get(i).charAt(0));
            }
            catch (IndexOutOfBoundsException ioobe){
                System.out.println(ioobe.getMessage());
                System.out.println("Túl lett indexelve");
                ioobe.printStackTrace();
            }
        }
        System.out.println("Vége");
    }

    public static void main(String[] args) {
        FirstLetter firstLetter = new FirstLetter();
        firstLetter.writeAllTheWords();
    }
}
