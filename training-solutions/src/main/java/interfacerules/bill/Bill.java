package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Bill {
    public List<String> readBillItemsFromFile(Path path){
        List<String> billItems = new ArrayList<>();
        try {
            billItems = Files.readAllLines(path);
        }catch (IOException ioe){
            throw new IllegalStateException("File not found");
        }
        return billItems;
    }
}
