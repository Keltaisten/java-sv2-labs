package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    @Test
    public void addNote1() {
        Student student = new Student();
        student.addNote(4);
        assertEquals(4,student.getGrades().get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNote2() {
        new Student().addNote(6);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void addNote3() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Note must be between 1 and 5!");
        new Student().addNote(7);
    }

    @Test
    public void addNote4() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Student().addNote(0));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}