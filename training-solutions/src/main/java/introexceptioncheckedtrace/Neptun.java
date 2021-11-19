package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Neptun {
    public static void main(String[] args) {
        try {
            System.out.println(new Neptun().readNeptunCodes());
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public List<String> readNeptunCodes() throws IOException{
        return Files.readAllLines(Paths.get("src/main/resources/neptun.csv"));
    }
}
