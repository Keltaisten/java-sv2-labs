package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {
    @Test
    void createTest(){
        assertEquals('e', new WithoutAccents().whichChar('é'));
    }
    @Test
    void createTest2(){
        assertEquals('t', new WithoutAccents().whichChar('t'));
    }
    @Test
    void createTest3(){
        assertEquals('o', new WithoutAccents().whichChar('ö'));
    }
}
