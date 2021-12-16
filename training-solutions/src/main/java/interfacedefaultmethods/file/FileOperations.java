package interfacedefaultmethods.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public interface FileOperations {
    default List<String> readFromFile(Path path){
        List<String> reads = new ArrayList<>();
        try {
            reads = Files.readAllLines(path);
        }catch (IOException ioe){
            throw new IllegalStateException("File not found", ioe);
        }
        return reads;
    }

    String getLongWord();
}
