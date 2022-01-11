package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    @Test
    void getFullNames() {
        Siblings siblings = new Siblings();
        System.out.println(siblings.getFullNames("Szabó", Paths.get("src/test/resources/surname.txt")));
    }
}