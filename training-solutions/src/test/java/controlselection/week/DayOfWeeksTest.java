package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeeksTest {

    @Test
    void createTest(){
        assertEquals("hét vége", new DayOfWeeks().whichDay("Szombat"));
    }

    void createTest2(){
        assertEquals("ismeretlen nap", new DayOfWeeks().whichDay("egy nap"));
    }
}
