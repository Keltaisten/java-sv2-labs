package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    private List<String> notAvailableDates = new ArrayList<>();

    public void createDateList(){
        notAvailableDates.add(LocalDate.now() + ", Tamási Áron utca");
        notAvailableDates.add(LocalDate.now() + ", Major utca");
        notAvailableDates.add(LocalDate.now() + ", Püspök Kertváros");
        notAvailableDates.add(LocalDate.now() + ", Fő utca");
    }

    public void writeStreets(Path path){
        try {
            Files.write(path,notAvailableDates);
        }catch (IOException ioe){
            throw new IllegalStateException("File not found");
        }
    }
}
