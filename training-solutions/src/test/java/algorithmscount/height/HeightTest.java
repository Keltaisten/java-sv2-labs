package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void countChildrenWithHeightGreaterThan() {
        Height height = new Height();
        List<Integer> childerWithHeight = new ArrayList<>(Arrays.asList(155,150,140,135,130,145,150,130));
        assertEquals(3,height.countChildrenWithHeightGreaterThan(childerWithHeight,148));
    }
}