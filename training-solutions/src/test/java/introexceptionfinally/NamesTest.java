package introexceptionfinally;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class NamesTest {

    @Test
    void createTest1(){
        Names names = new Names();
        names.readName(Paths.get("src/main/resources/names.txt"));
    }

    @Test
    void createTest2(){
        Names names = new Names();
        names.readName(Paths.get("src/main/resources/names2.txt"));
    }

    @Test
    void createTest3(){
        Names names = new Names();
        assertThrows(IllegalStateException.class, ()->
                names.readName(Paths.get("src/main/resources/nameX.txt")));
    }

}