package interfacedefaultmethods.file;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void getLongWord() {
        LongWord longWord = new LongWord();
        longWord.setReads(Paths.get("src/test/resources/longword.txt"));
        assertEquals("LONGWORD", longWord.getLongWord());
    }

}