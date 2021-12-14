package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {
    Payable amount;
    Payable cash;
    Payable bankAtm;

    @Test
    void testAmount() {
        amount = new Amount();
        assertEquals(2113, amount.getPayableAmount(2113));
    }

    @Test
    void testCash() {
        cash = new Cash();
        assertEquals(2115, cash.getPayableAmount(2113));
    }

    @Test
    void testCash2() {
        cash = new Cash();
        assertEquals(2110, cash.getPayableAmount(2112));
    }

    @Test
    void testBankAtm() {
        bankAtm = new BankAtm();
        assertEquals(3000, bankAtm.getPayableAmount(2113));
    }

    @Test
    void testBankAtm2() {
        bankAtm = new BankAtm();
        assertEquals(128000, bankAtm.getPayableAmount(127207));
    }

}