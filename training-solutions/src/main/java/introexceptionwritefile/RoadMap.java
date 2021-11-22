package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {
    List<String> roadList = Arrays.asList("Veszprém", "Várpalota", "Székesfehérvár");
        try {
            Files.write(Paths.get("roadmap.txt"), roadList);
        }catch (IOException ioe){
            throw new IllegalStateException("File not found", ioe);
        }
    }
}
