package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersTest {
    @Test
    void testGetEvenNumbers(){
        assertArrayEquals(new int[]{0,6,0,6,8}, new Numbers().getEvenNumbers(new int[] {1,6,7,6,8}));
    }
}
