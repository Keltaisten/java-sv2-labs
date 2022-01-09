package exceptions.sum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    @Test
    void getSumNotOk() {
        NumbersSum numbersSum = new NumbersSum();
        int[] numbers = null;
        assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(numbers));
    }

    @Test
    void getSumNotOk2() {
        NumbersSum numbersSum = new NumbersSum();
        int[] numbers = null;
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("The array cannot be empty!",iae.getMessage());
    }

    @Test
    void testGetSumWithString() {
        NumbersSum numbersSum = new NumbersSum();
        String[] numbers = null;
        assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(numbers));
    }

    @Test
    void testGetSumWithString2() {
        NumbersSum numbersSum = new NumbersSum();
        String[] numbers = null;
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("The array cannot be empty!", iae.getMessage());
    }

    @Test
    void testGetSumWithString3() {
        NumbersSum numbersSum = new NumbersSum();
        String[] numbers = {"1", "2", "notANumber", "3", "4"};
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("Not only numbers in the list!", iae.getMessage());
    }
}