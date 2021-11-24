package algorithmsmax.hill;

import algorithmsmax.temperature.Temperature;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void getMax() {
        Hill hill = new Hill();
        List<Integer> list = new ArrayList<>(Arrays.asList(2000,1832,2323,2576,2687,246,
                2234,2078,1954,172,1854,206));
        int max = hill.getMax(list);
        assertEquals(2687,max);
    }
}