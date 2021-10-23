package array;

public class ArrayHandler {
    public static void main(String[] args) {
        String indexNumbersConc = "";
        String indexWordsConc = "";

        int[] indexNumbers = new int[4];
        indexNumbers[0] = 2;
        indexNumbers[1] = 5;
        indexNumbers[2] = 15;
        indexNumbers[3] = 22;

        String[] indexWord = new String[5];
        indexWord[0] = "Alma";
        indexWord[1] = "Banán";
        indexWord[2] = "Kifli";
        indexWord[3] = "Palacsinta";
        indexWord[4] = "Körte";


        addIndexToNumber(indexNumbers);
        for (int list: indexNumbers) {
            System.out.println(list);
            indexNumbersConc = indexNumbersConc + list + ", ";
        }
        System.out.println(indexNumbersConc);


        concatenateIndexToWord(indexWord);
        for(String word: indexWord){
            System.out.println(word);
            indexWordsConc = indexWordsConc + word + ", ";
        }
        System.out.println(indexWordsConc);
    }

    public static void addIndexToNumber(int[] source){
        for(int i = 0; i<source.length;i++){
            source[i] = source[i] + i;
        }
    }

    public static void concatenateIndexToWord(String[] source){
        for(int i = 0; i<source.length; i++){
            source[i] = i + " " + source[i];
        }
    }
}

