package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void testCreate() {
        Player player = new Player();

        assertNull(player.getName());
        assertNull(player.getEmailAddress());
    }

    @Test
    void testSetNameAndEmail() {
        Player player = new Player();
        player.setName("Kiss József");
        player.setEmailAddress("kissj@gmail.com");

        assertEquals("Kiss József", player.getName());
        assertEquals("kissj@gmail.com", player.getEmailAddress());
    }

}