package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DragonTest {

    @Test
    void testName(){
        assertEquals(new Dragon("Baron", 6,2_256.5).getName(), "Baron");

        assertNotEquals(new Dragon("Dune",2,3_201).getName(), "Booo");
    }

    @Test
    void testNumberOfHeads(){
        assertEquals(new Dragon("Baron", 5,3432).getNumberOfHeads(),5);
    }
}
