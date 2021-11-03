package junit5;

import junit5.Gentleman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void createTest(){
//        Given
        Gentleman gentleman = new Gentleman();

//        When

        String name = gentleman.sayHello("John Doe");

//        Then
        assertEquals("Hello John Doe!", name);

    }

    @Test
    void createTest2(){
        assertEquals("Hello Anonymous!", new Gentleman().sayHello(null));
    }
}
