package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import recursion.Palindrome;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    @TempDir
    File temporaryFolder;

    @Test
    void writeStreetsWithWrongPath() throws IOException {
        Electricity electricity = new Electricity();
        electricity.createDateList();
        Path path = temporaryFolder.toPath().resolve("streets.txt");
        electricity.writeStreets(path);
        List<String> dateAndStreets = Files.readAllLines(path);
        assertEquals("2021-12-10, Püspök Kertváros",dateAndStreets.get(2));
    }

    @Test
    void writeStreetsWithGoodValue() throws IOException {
        Electricity electricity = new Electricity();
        electricity.createDateList();
        Path path = Paths.get("src/test/resources/streets.txt");
        electricity.writeStreets(path);
        List<String> dateAndStreets = Files.readAllLines(path);
        assertEquals("2021-12-10, Tamási Áron utca",dateAndStreets.get(0));
    }
}