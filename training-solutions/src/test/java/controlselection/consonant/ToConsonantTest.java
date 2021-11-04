package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {

    @Test
    void createTest(){
        assertEquals('v', new ToConsonant().whichCharacter('u'));
    }
    @Test
    void createTest2(){
        assertEquals('c', new ToConsonant().whichCharacter('c'));
    }
    @Test
    void createTest3(){
        assertEquals('?', new ToConsonant().whichCharacter('_'));
    }
}
