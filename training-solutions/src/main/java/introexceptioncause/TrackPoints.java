package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TrackPoints {

    public List<String> readTheTrackFile() {
        try {
            return Files.readAllLines(Paths.get("src/main/resources/tracking.csv"));
        }catch (IOException ioe){
            throw new IllegalStateException("File not found", ioe);
        }
    }

    public void getThePoint(List<String> list) {
        for(int i = 1; i< list.size();i++){
            System.out.println(calculateDiff(list.get(i-1),list.get(i)));
        }
    }

    private int calculateDiff(String sPrev, String sCurrent) {
        int previous=  Integer.parseInt(sPrev.substring(sPrev.lastIndexOf(';') + 1));
        int current=  Integer.parseInt(sCurrent.substring(sCurrent.lastIndexOf(';') + 1));
        return current - previous;
    }
}
