package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void getNumberOfStudents() {
        School school = new School();
        List<Integer> head = new ArrayList<>(Arrays.asList(30,25,28,31,26,30,28));
        assertEquals(198,school.getNumberOfStudents(head));
    }
}