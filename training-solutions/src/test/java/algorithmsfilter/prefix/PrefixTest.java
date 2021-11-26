package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void getWordsStartWith() {
        List<String> words = Arrays.asList("teke", "teve", "takó", "tekergő", "hang");
        assertEquals(2,(new Prefix().getWordsStartWith(words,"teke")).size());
    }

    @Test
    void getWordsStartWith2() {
        List<String> words = Arrays.asList("teke", "teve", "takó", "tekergő", "hang");
        assertEquals("teve",(new Prefix().getWordsStartWith(words,"te")).get(1));
    }

    @Test
    void getWordsStartWith3() {
        List<String> words = Arrays.asList("teke", "teve", "takó", "tekergő", "hang");
        assertNotEquals("takó",(new Prefix().getWordsStartWith(words,"te")).get(2));
    }
}