package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void containsLongerWord() {
        Word wordClass = new Word();
        List<String> listOfWords = Arrays.asList("kifli","kenyér","zsemle","hal","csirke","körte");
        assertTrue(wordClass.containsLongerWord(listOfWords, "leves"));
        assertFalse(wordClass.containsLongerWord(listOfWords, "leveskocka"));
        assertTrue(wordClass.containsLongerWord(listOfWords, "kanál"));
    }
}