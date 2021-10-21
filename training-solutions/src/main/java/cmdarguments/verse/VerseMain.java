package cmdarguments.verse;

public class VerseMain {
    public static void main(String[] args) {
        String poem = "";
        String poemReverse = "";
        for (String vers: args){
            poem = poem + vers + " ";
        }
        System.out.println(poem);


        for (int i = (args.length -1); i > -1; i--){

            poemReverse = poemReverse + args[i] + ", ";
        }
        System.out.println(poemReverse);
    }
}
