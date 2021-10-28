package chars;

public class Whitespace {
    public String makeWhitespaceToStar(String text){
        char[] textArray = text.toCharArray();
        for(int i = 0;i< textArray.length;i++){
            if(textArray[i] == ' '){
                textArray[i] = '*';
            }
        }
        String newText = new String(textArray);
        return newText;
    }

    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar("Ez egy szép mondat."));
    }
}
