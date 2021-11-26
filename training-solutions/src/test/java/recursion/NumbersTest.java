package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    @Test
    void testGetSum() {
        Numbers numbers = new Numbers();

        assertEquals(26, numbers.getSum(new int[]{5, 6, 7, 8}));
        assertEquals(5, numbers.getSum(new int[]{5}));
        assertEquals(0, numbers.getSum(new int[]{}));
    }
}