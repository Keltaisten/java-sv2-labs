package introjunit;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {


    @Test
    public void testCreate(){

//        Given
        Gentleman gentleman = new Gentleman();

//        When
        String sayHello = gentleman.sayHello("John Doe");

//        Then
        assertThat(sayHello, equalTo("Hello John Doe!"));

    }
    @Test
    public void testCreate2(){

        assertThat(new Gentleman().sayHello(null), equalTo("Hello Anonymous!"));
    }
}
