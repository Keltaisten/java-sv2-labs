package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {
    Words words;

    @BeforeEach
    void beforeTest(){
        words = new Words();
        words.addWord("MrSenki");
        words.addWord("MrNobody");
        words.addWord("Valaki");
        words.addWord("NevemSenki");
        words.addWord("MrKicsoda");
        words.addWord("Bajital");
    }

    @Test
    void testGetWordsStartWith(){
        words.getWordsStartWith("Mr");
        List<String> arrayList1 = Arrays.asList("MrSenki","MrNobody","MrKicsoda");
        List<String> arrayList2 = words.getWords();
        assertEquals(arrayList1,  arrayList2);
    }

    @Test
    void testGetWordsWithLength(){
        words.getWordsWithLength(7);
        List<String> arrayList1 = Arrays.asList("MrSenki","Bajital");
        assertEquals(arrayList1, words.getWords());
    }
}
