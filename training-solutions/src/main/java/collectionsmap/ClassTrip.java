package collectionsmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class ClassTrip {
    private Map<String, Integer> inpayments = new HashMap<>();

    public Map<String, Integer> getInpayments() {
        return inpayments;
    }

    public void loadInpayments(Path path){
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while((line = br.readLine()) != null){
                String[] parts = line.split(": ");
                inpayments.put(parts[0], Integer.parseInt(parts[1]));
            }

        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read file.", ioException);
        }
    }
}
