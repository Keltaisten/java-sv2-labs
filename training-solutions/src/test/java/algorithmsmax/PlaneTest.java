package algorithmsmax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void getLongestOcean() {
        String map = "10000000111110000000000001111111111000010000010000100000" +
                "111111110000101000000000111110000000000000000100000001000000000000" +
                "111111000000000100000000000011";
        Plane plane = new Plane();
        assertEquals(16,plane.getLongestOcean(map));
    }
}