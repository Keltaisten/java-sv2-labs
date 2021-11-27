package recursion;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome("MADAM"));
        assertTrue(palindrome.isPalindrome("ABBA"));
        assertFalse(palindrome.isPalindrome("ABklBA"));
    }
}