package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {
    public static void main(String[] args) {
        List<String> poemList = new Poem().readFiles();
        System.out.println(new Poem().getFirstLetters(poemList));
    }

    private String getFirstLetters(List<String> poemList) {
        StringBuilder firstLetters = new StringBuilder();
        for(String s: poemList){
            firstLetters.append(s.charAt(0));
        }
        return firstLetters.toString();
    }

    public List<String> readFiles(){
        try {
            return Files.readAllLines(Paths.get("src/main/resources/poem.txt"));
        }catch (IOException ioe){
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }
}
