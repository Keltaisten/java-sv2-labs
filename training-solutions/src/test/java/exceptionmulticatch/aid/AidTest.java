package exceptionmulticatch.aid;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class AidTest {

    @Test
    void countAmountsOfAid() {
        Aid aid = new Aid(1_489_6);
        System.out.println(aid.countAmountsOfAid(Paths.get("src/test/resources/population1.txt")));
        System.out.println(aid.countAmountsOfAid(Paths.get("src/test/resources/population2.txt")));
        System.out.println(aid.countAmountsOfAid(Paths.get("src/test/resources/population3.txt")));
        System.out.println(aid.countAmountsOfAid(Paths.get("src/test/resources/population4.txt")));
        System.out.println(aid.countAmountsOfAid(Paths.get("src/test/resources/population5.txt")));
    }
}