package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Words {

        public String getFirstWordWithA(Path path){
                List<String> wordList = new Words().readFiles(path);
                for(String s: wordList){
                        if(s.startsWith("A")){
                                return s;
                        }
                }
                return "A";
        }

        private List<String> readFiles(Path path){
                try {
                        return Files.readAllLines(path);
                }catch (IOException ioe){
                        throw new IllegalStateException("File not found", ioe);
                }
        }
}
