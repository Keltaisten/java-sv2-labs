package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {
    public static void main(String[] args) {
        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32",
                "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");

        for(String s: codedMessage){
            System.out.print(Character.toChars(Integer.parseInt(s)));   //Neked is!
        }

        System.out.println();

        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121",
                "32", "104", "105", "98", "225", "115", "32", "252", "122", "101", "110", "101", "116", "46");

        for(String s: anotherCodedMessage){
            System.out.print(Character.toChars(Integer.parseInt(s)));
        }
    }
}
