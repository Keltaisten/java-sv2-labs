package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ElectricityTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testCreate() throws IOException {
        Path path = temporaryFolder.newFile("streets.txt").toPath();
        List<String> electriList = Arrays.asList(String.valueOf(LocalDate.now()), "Bártfai",
                "Püspökkertváros", "Tamási Áron", "Tamási Áron");

        new Electricity().writeStreets(electriList, path);

        List<String> readLines = Files.readAllLines(path);
        assertEquals(Arrays.asList("2021-12-06", "Bártfai", "Püspökkertváros",
                "Tamási Áron", "Tamási Áron"),readLines);
    }


    @Test
    public void testCreate2() throws IOException{
        Electricity electricity = new Electricity();
        List<String> streets = new ArrayList<>();
        Path path = temporaryFolder.newFile("streets2").toPath();
        electricity.createList(streets);
        electricity.writeStreets(streets, path);
        List<String> readFile = Files.readAllLines(path);
        assertEquals("Püspökkertváros", readFile.get(2));
    }
}