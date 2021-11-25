package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void containsFewerHabitants() {
        Town town = new Town();
        List<Integer> peopleOfTown = Arrays.asList(27_000,30_000,45_000,51_000,42_000,22_000);
        assertTrue(town.containsFewerHabitants(peopleOfTown, 25_000));
        assertFalse(town.containsFewerHabitants(peopleOfTown, 20_000));
        assertTrue(town.containsFewerHabitants(peopleOfTown, 55_000));
    }
}