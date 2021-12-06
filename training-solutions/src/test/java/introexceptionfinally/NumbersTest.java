package introexceptionfinally;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void testCreate(){
        Numbers numbers = new Numbers();
        numbers.askForNumbers();
    }

}