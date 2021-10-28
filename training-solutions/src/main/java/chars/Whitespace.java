package chars;

import java.util.ArrayList;
import java.util.List;

public class Whitespace {
    public List<String> makeWhitespaceToStar(String text){
        List<String> wooords = new ArrayList<>();
        List<String> wooords2 = new ArrayList<>();
//        for(char i: text.toCharArray()){
//            if(i == ' '){
//                wooords.add("*");
//            }else{
//                wooords.add(text.charAt(i));
//            }
//        }

//        for(int i = 0; i < text.length();i++){
//            if(text.toCharArray()[i] == ' '){
//                text.toCharArray()[i] = '*';
////                text[i] = '*';
//            }
////            if(text.indexOf(' ') == ' '){
////                i = ' ';
////            }
//        }

        for(int i = 0; i < text.length();i++){
            if(text.toCharArray()[i] == ' '){
                wooords2.add("*");
//                text[i] = '*';
            }else{
                wooords2.add(String.valueOf(text.toCharArray()[i]));
            }
//            if(text.indexOf(' ') == ' '){
//                i = ' ';
//            }
        }
        
        return wooords2;
    }

    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar("Ez egy szép mondat."));
    }
}
