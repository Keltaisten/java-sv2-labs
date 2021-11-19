package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testCreate(){
        Student student = new Student();
        student.addNote(5);
        assertEquals(5,student.getGrades().get(0));
    }

    @Test
    void testCreate2(){

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Student().addNote(6));
        assertEquals("Note must be between 1 and 5!",exception.getMessage());
    }

}