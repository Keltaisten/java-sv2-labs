package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    public static void main(String[] args) {
        List<String> electriList = new ArrayList<>();
        Electricity el = new Electricity();
        Path path = Paths.get("src/main/resources/electricity.txt");
        el.createList(electriList);
        el.writeStreets(electriList, path);
    }

    public void createList(List<String> electriList){
        electriList.add(String.valueOf(LocalDate.now()));
        electriList.add("Bártfai");
        electriList.add("Püspökkertváros");
        electriList.add("Tamási Áron");
        electriList.add("Tamási Áron");
    }

    public void writeStreets(List<String> elList, Path path){
        try {
            Files.write(path, elList);
        }catch (IOException ioe){
            throw new IllegalStateException("File not found", ioe);
        }
    }
}
