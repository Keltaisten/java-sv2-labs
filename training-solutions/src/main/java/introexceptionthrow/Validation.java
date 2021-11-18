package introexceptionthrow;

public class Validation {
    void validateName(String name){
        if(name == null || name ==""){
            throw new IllegalArgumentException("You didnt give your name");
        }
    }

    void validateAge(String ageString){
        if(ageString == null || ageString ==""){
            throw new IllegalArgumentException("You didnt give your name");
        }

        char[] wordChar = ageString.toCharArray();
        for(Character c: wordChar){
            if(!Character.isDigit(c)){
                throw new IllegalArgumentException("Not a number");
            }
        }

        if(Integer.parseInt(ageString)  < 0 || Integer.parseInt(ageString) > 120){
            throw new IllegalArgumentException("The given number smaller than 0 or bigger than 120");
        }
    }


}
