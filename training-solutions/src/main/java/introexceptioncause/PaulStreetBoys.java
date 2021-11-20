package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {

    public static void main(String[] args) {
        List<String> nameList = new PaulStreetBoys().readTheNames();
        System.out.println(new PaulStreetBoys().toLowerNemecsek(nameList));
    }

    private List<String> toLowerNemecsek(List<String> nameList) {
        for(String s: nameList){
            if(s.equals("Nemecsek Ernő")){
                s = s.toLowerCase();
            }
        }
        nameList.set(nameList.indexOf("Nemecsek Ernő"),nameList.get(nameList.indexOf("Nemecsek Ernő")).toLowerCase());
        return nameList;
    }

    private List<String> readTheNames() {
        try {
            return Files.readAllLines(Paths.get("palutcaifiuk.txt"));
        }catch (IOException ioe){
            throw new IllegalStateException("Not found", ioe);
        }

    }
}
