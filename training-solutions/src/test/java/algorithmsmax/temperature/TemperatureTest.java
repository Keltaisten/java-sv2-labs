package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void getMin() {
        Temperature temp = new Temperature();
        List<Integer> list = new ArrayList<>(Arrays.asList(20,18,23,25,26,24,22,20,19,17,18,20));
        int min = temp.getMin(list);
        assertEquals(17,min);
    }
}