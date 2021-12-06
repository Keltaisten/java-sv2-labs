package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Names {
    public void readName(Path path){
        List<String> nameList = new ArrayList<>();
        try {
            nameList = Files.readAllLines(path);
        }catch (IOException ioe){
            throw new IllegalStateException("File not found", ioe);
        }
        finally {
            System.out.println("End of reading.");
        }

        boolean bool = true;
        for(String name: nameList){
            if(name.startsWith("dr") && bool){
                System.out.println(name);
                bool = false;
            }
        }
        if(bool){
            System.out.println("");
        }
    }
}
