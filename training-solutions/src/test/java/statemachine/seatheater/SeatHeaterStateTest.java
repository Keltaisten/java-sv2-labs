package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void nextDef() {
        SeatHeaterState seat = SeatHeaterState.DEFAULT;
        assertEquals(SeatHeaterState.MAX, seat.next());
    }

    @Test
    void nextMax() {
        SeatHeaterState seat = SeatHeaterState.MAX;
        assertEquals(SeatHeaterState.MEDIUM, seat.next());
    }

    @Test
    void nextMed() {
        SeatHeaterState seat = SeatHeaterState.MEDIUM;
        assertEquals(SeatHeaterState.MINIMUM, seat.next());
    }

    @Test
    void nextMin() {
        SeatHeaterState seat = SeatHeaterState.MINIMUM;
        assertEquals(SeatHeaterState.DEFAULT, seat.next());
    }
}