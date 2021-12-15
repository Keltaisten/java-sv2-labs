package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void tableClothTest(){
        Square tableCloth = new TableCloth(25);
        assertEquals(4,tableCloth.getNumberOfSides());
        assertEquals(25,tableCloth.getSide());
        assertEquals(35.355339,tableCloth.getLengthOfDiagonal(),0.00001);
        assertEquals(100,tableCloth.getPerimeter());
        assertEquals(625,tableCloth.getArea());
    }

}