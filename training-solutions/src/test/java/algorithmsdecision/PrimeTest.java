package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrime() {
        Prime prime = new Prime();
        assertTrue(prime.isPrime(5));
        assertTrue(prime.isPrime(47));
        assertFalse(prime.isPrime(102));
        assertFalse(prime.isPrime(75));
    }
}