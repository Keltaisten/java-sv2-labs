package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {
    public List<String> readFromFile(Path path){
        List<String> readed;
        try{
            readed = Files.readAllLines(path);
        }
        catch(IOException ioe){
            throw new IllegalArgumentException("File not found", ioe);
        }
        return readed;
    }

    public List<String> validate(List<String> readed){
        List<String> validated = new ArrayList<>();
        for(String s: readed){
            String[] splittedReadedData = s.split(",");
            boolean firstCheck = checkFirstParse(splittedReadedData);
            boolean secondCheck = checkSecondParse(splittedReadedData);
            boolean thirdCheck = checkThird(splittedReadedData);
            boolean fourthCheck = checkFourthExist(splittedReadedData);
            if(firstCheck || secondCheck || thirdCheck || fourthCheck){
                validated.add(s);
            }
        }
        return validated;
    }

    private boolean checkFourthExist(String[] splittedReadedData) {
        try {
            String s = splittedReadedData[3];
        }
        catch (ArrayIndexOutOfBoundsException aioobe){
            return false;
        }
        return true;
    }

    private boolean checkThird(String[] splittedReadedData) {
        try {
            if(splittedReadedData[2].trim().contains(" ")){
                return false;
            }
            else{
                return true;
            }
        }
        catch(ArrayIndexOutOfBoundsException aioobe){
            return true;
        }
    }

    private boolean checkSecondParse(String[] splittedReadedData) {
        try {
            Double.parseDouble(splittedReadedData[1]);
        }
        catch(NumberFormatException nfe){
            return true;
        }
        return false;
    }

    private boolean checkFirstParse(String[] splittedReadedData) {
        try {
            Integer.parseInt(splittedReadedData[0]);
        }
        catch(NumberFormatException nfe){
            return true;
        }
        return false;
    }
}
