package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import recursion.Palindrome;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    @Test
    void writeStreetsWithWrongPath() {
        Electricity electricity = new Electricity();
        electricity.createDateList();
        Path wrongPath = Paths.get("nothingPath.txt");
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                ()-> electricity.writeStreets(wrongPath));
        assertEquals("File not found", ise.getMessage());
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