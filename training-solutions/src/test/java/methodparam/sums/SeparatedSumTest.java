package methodparam.sums;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void sum() {
        SeparatedSum separatedSum = new SeparatedSum();
        Path path = Paths.get("src/test/resources/floatingnumbers.txt");

        String readNumbersList = separatedSum.readFile(path);
        assertEquals(110.6,separatedSum.sum(readNumbersList).get(0));
        assertEquals(-153.3,separatedSum.sum(readNumbersList).get(1),0.000001);
    }
}