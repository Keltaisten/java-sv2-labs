package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    @Test
    void testCreate(){
        Tank tank = new Tank();
        tank.modifyAngle(30);
        assertEquals(30,tank.getAngle());
    }

    @Test
    void testCreate2(){
        IllegalArgumentException except = assertThrows(IllegalArgumentException.class,
                ()-> new Tank().modifyAngle(90));
        assertEquals("Cant perform this action",except.getMessage());
    }

}