package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void getFirstTwoLetersTest() {
        TwoLetters twoLetters = new TwoLetters();
        List<String> listOfWords = Arrays.asList("verág", "korcsolya", "bolygó", "tulipán", "zászló");
        assertEquals(Arrays.asList ("ve","ko", "bo","tu", "zá"), twoLetters.getFirstTwoLeters(listOfWords));
    }
}