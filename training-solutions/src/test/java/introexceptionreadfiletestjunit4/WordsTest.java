package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordsTest {

    @Test
    public void testCreate(){
        String wordList = new Words().getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertEquals("Anna",wordList);
    }

    @Test
    public void testCreate2(){
        String wordList = new Words().getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertNotEquals("NemAnna",wordList);
    }

    @Test
    public void testCreate3(){
//        String wordList = new Words().getFirstWordWithA(Paths.get("src/test/resources/words__.txt"));
//        assertEquals("NemAnna",wordList);
        assertThrows(IllegalStateException.class,
                () -> new Words().getFirstWordWithA(Paths.get("src/test/resources/words__.txt")));
    }

    @Test
    public void testCreate4(){
        String wordList = new Words().getFirstWordWithA(Paths.get("src/test/resources/words2.txt"));
        assertEquals("A",wordList);
    }

    @Test
    public void testCreate5(){
        String wordList = new Words().getFirstWordWithA(Paths.get("src/test/resources/words2.txt"));
        assertNotEquals("NemAnna",wordList);
    }

    @Test
    public void testNotExistFile(){
        Path path = Paths.get("src/test/resources/totallyNotWords.txt");

//        IllegalStateException exception;

        assertThrows(IllegalStateException.class,
                () -> new Words().getFirstWordWithA(Paths.get("src/test/resources/words__.txt")));
    }

}