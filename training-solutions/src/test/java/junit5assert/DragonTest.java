package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    void testName(){
        assertEquals(new Dragon("Baron", 6,2_256.5).getName(), "Baron");

        assertNotEquals(new Dragon("Dune",2,3_201).getName(), "Booo");
    }

    @Test
    void testNumberOfHeads(){
        assertEquals(new Dragon("Baron", 5,3432).getNumberOfHeads(),5);

        assertTrue(new Dragon("Baron", 5,3432).getNumberOfHeads() == 5);

        assertFalse(new Dragon("Baron", 5,3432).getNumberOfHeads() == 4);
    }

    @Test
    void testHeight(){
        assertEquals(new Dragon("Baron", 5,3432.5).getHeight(),3432.5014, 0.005);
    }

    @Test
    void testNull(){
        Dragon dragon1 = new Dragon("Baron", 5,3432.5);
        Dragon dragon2 = new Dragon(null, 5,3432.5);

        assertNull(dragon2.getName());
        assertNotNull(dragon1.getName());
    }

    @Test
    void testSameObjects(){
        Dragon dragon1 = new Dragon("Baron", 5,3432.5);
        Dragon dragon2 = dragon1;

        assertSame(dragon1,dragon2);
    }

    @Test
    void testNotSameObjects(){
        Dragon dragon1 = new Dragon("Baron", 5,3432.5);
        Dragon dragon2 = new Dragon("Baron", 5,3432.5);

        assertNotSame(dragon1,dragon2);
    }
}
