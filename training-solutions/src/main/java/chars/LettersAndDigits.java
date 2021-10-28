package chars;

public class LettersAndDigits {
    public void printLetterOrDigit(String text){
        for(char i: text.toCharArray()){
            if(Character.isAlphabetic(i)){
                System.out.println(i + " : betű");
            }else if(Character.isDigit(i)){
                System.out.println(i + " : számjegy");
            }else{
                System.out.println(i + " : egyéb");
            }
        }
    }

    public static void main(String[] args) {
        LettersAndDigits lettes = new LettersAndDigits();
        lettes.printLetterOrDigit("Hab4labund1!");
    }
}
