package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void getTrainerWithMaxAge() {
        List<Trainer> trainersList = new ArrayList<>(Arrays.asList(new Trainer("John",30),
                new Trainer("Jake",35),new Trainer("Jack",32)));
        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();
        int maxAge = maxAgeCalculator.getTrainerWithMaxAge(trainersList);
        assertEquals(35, maxAge);
    }
}