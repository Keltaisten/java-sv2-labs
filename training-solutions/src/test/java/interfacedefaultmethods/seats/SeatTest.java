package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {
    Seat car;
    Seat sportsCar;
    Seat familyCar;

    @Test
    void familyCarTest(){
        familyCar = new FamilyCar();
        assertEquals(5,familyCar.getNumberOfSeats());
    }

    @Test
    void carTest(){
        car = new Car("Seat", 4);
        assertEquals(4,car.getNumberOfSeats());
    }

    @Test
    void sportsCarTest(){
        sportsCar = new SportsCar();
        assertEquals(2,sportsCar.getNumberOfSeats());
    }
}