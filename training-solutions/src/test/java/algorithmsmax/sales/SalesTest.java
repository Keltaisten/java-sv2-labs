package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    List<Salesperson> salespersons = Arrays.asList(
            new Salesperson("Jake", 500, 100),
            new Salesperson("Jill", 350, 300),
            new Salesperson("Jane", 300, 150),
            new Salesperson("John", 200, 500),
            new Salesperson("Jhin", 100, 150)
    );

    @Test
    void selectSalesPersonWithMaxSalesAmount() {
        Sales maxAmount = new Sales();
        assertEquals(500, maxAmount.selectSalesPersonWithMaxSalesAmount(salespersons).getAmount());
    }

    @Test
    void selectSalesPersonWithFurthestAboveTarget() {
        Sales targetDiff = new Sales();

        assertEquals(400, targetDiff.selectSalesPersonWithFurthestAboveTarget(salespersons).getDiffFromTarget());
        assertEquals(500, targetDiff.selectSalesPersonWithFurthestAboveTarget(salespersons).getAmount());
        assertEquals(100, targetDiff.selectSalesPersonWithFurthestAboveTarget(salespersons).getTarget());
    }

    @Test
    void selectSalesPersonWithFurthestBelowTarget() {
        Sales targetDiff = new Sales();

        assertEquals(-300, targetDiff.selectSalesPersonWithFurthestBelowTarget(salespersons).getDiffFromTarget());
        assertEquals(200, targetDiff.selectSalesPersonWithFurthestBelowTarget(salespersons).getAmount());
        assertEquals(500, targetDiff.selectSalesPersonWithFurthestBelowTarget(salespersons).getTarget());
    }
}