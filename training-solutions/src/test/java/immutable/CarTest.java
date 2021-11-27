package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCreateForConstructorEverythingOK(){
        new Car("Toyota", "Corolla", 2018);
    }

    @Test
    void testCreateForConstructorBrandIsNull(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> new Car(null, "Corolla", 2003));
        assertEquals("Brand name is NOK",iae.getMessage());
    }

    @Test
    void testCreateForConstructorBrandIsEmpty(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> new Car("", "Yaris", 2010));
        assertEquals("Brand name is NOK",iae.getMessage());
    }

    @Test
    void testCreateForConstructorDateIsNOK(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> new Car("Toyota", "Auris", 2042));
        assertEquals("YearOfProduction name is NOK",iae.getMessage());
    }

}