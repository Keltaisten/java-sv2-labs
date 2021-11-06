package controladvanced.labels;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabelsTest {
    @Test
    public void createTest(){
        assertEquals(0, new Labels().getTableOfNumbers(5)[3][3]);
    }
}
