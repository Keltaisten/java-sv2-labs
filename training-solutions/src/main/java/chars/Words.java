package chars;

public class Words {
    public String pushWord(String word){
        String modifiedWord = "";
        for(char i: word.toCharArray()){
            modifiedWord += (char)(i+1);
        }
        return modifiedWord;
    }

    public static void main(String[] args) {
        Words words = new Words();
        System.out.println(words.pushWord("kenőmájas melegszendvics"));
        System.out.println(words.pushWord("alma"));
    }
}
