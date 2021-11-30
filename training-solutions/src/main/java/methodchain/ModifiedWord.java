package methodchain;

public class ModifiedWord {
    private String word;

    public ModifiedWord modify(String word){
        this.word = word;
        return this;
    }

    public ModifiedWord checkTheWordLongerThanThreeCharacter() {
        if(word.length() < 4){
            throw new IllegalArgumentException("The given word is smaller than four characters");
        }
        else{
            return this;
        }
    }

    public ModifiedWord makeTheFirstLetterCapital(){
        word = word.replace(word.substring(0,1),word.substring(0,1).toUpperCase());
        return this;
    }

    public ModifiedWord changeTheSecondLetter(){
        word = word.replace(word.charAt(1),'x');
        return this;
    }

    public ModifiedWord makeTheThirdLetterCapital(){
        word = word.replace(word.substring(2,3),word.substring(2,3).toUpperCase());
        return this;
    }

    public ModifiedWord changeTheFourthLetter(){
        word = word.replace(word.substring(3,4),"y");
        return this;
    }

    public String getWord() {
        return word;
    }
}
