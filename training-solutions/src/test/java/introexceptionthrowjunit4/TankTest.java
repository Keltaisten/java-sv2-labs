package introexceptionthrowjunit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {
    Tank tank = new Tank();
    @Before
    public void setUp() {
        tank.modifyAngle(15);
        tank.modifyAngle(-40);
        tank.modifyAngle(-30);
        tank.modifyAngle(+60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void modifyAngle() {
        tank.modifyAngle(+100);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void modifyAngle2() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Cant perform this action");
        tank.modifyAngle(-90);
    }

    @Test
    public void modifyAngle3() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(+100));
        assertEquals("Cant perform this action", exception.getMessage());
    }
}