package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    @Test
    public void testCreate(){
        Mountain mountain = new Mountain();
        mountain.addPike();

        assertTrue(mountain.searchPike(new Pike("Alpok",1520)));
        assertTrue(mountain.searchPike(new Pike("Mount Everest",8848)));
        assertFalse(mountain.searchPike(new Pike("Himalaja",5642)));

    }

}