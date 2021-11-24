package algorithmssum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {

    @Test
    void sumSalesperson() {
        SalesAmountSumCalculator salCalc = new SalesAmountSumCalculator();
        List<Salesperson> sales = new ArrayList<>();
        sales.add(new Salesperson("John", 100_000));
        sales.add(new Salesperson("Jack", 200_000));
        sales.add(new Salesperson("Jane", 150_000));

        assertEquals(450_000,salCalc.sumSalesperson(sales));
    }
}