package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {

    public static void main(String[] args) {
        List<String> nameList = new PaulStreetBoys().readTheNames();
        System.out.println(new PaulStreetBoys().toLowerNemecsek(nameList));
    }

    private List<String> toLowerNemecsek(List<String> nameList) {
        int number = nameList.indexOf("Nemecsek Ernő");
        nameList.set(number,nameList.get(number).toLowerCase());
        return nameList;
    }

    private List<String> readTheNames() {
        try {
            return Files.readAllLines(Paths.get("src/main/resources/palutcaifiuk.txt"));
        }catch (IOException ioe){
            throw new IllegalStateException("Not found", ioe);
        }

    }
}
