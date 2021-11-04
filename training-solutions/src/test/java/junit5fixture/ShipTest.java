package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void beforeTest(){
        ship = new Ship("BlackPearl",1540,122.4);
    }

    @Test
    void testName(){
        assertEquals("BlackPearl",ship.getName());
        assertNotEquals("Titanic",ship.getName());
    }

    @Test
    void testYearOfConstruction(){
        assertEquals(1540,ship.getYearOfConstruction());
        assertTrue(1540 == ship.getYearOfConstruction());
        assertFalse(1620 == ship.getYearOfConstruction());
    }

    @Test
    void testLength(){
        assertEquals(122.444,ship.getLength(),0.05);
    }

    @Test
    void testNull(){
        Ship ship2 = new Ship(null,1540,122.4);

        assertNotNull(ship.getName());
        assertNull(ship2.getName());
    }

    @Test
    void testSameObjects(){
        Ship ship2 = ship;

        assertSame(ship, ship2);
    }

    @Test
    void testNotSameObjects(){
        Ship ship2 = new Ship("BlackPearl",1540,122.4);

        assertNotSame(ship, ship2);
    }

}
