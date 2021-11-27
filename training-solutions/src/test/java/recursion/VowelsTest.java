package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void getNumberOfVowels() {
        Vowels vowels = new Vowels();
        System.out.println(vowels.getNumberOfVowels("alma"));
        System.out.println(vowels.getNumberOfVowels("álmoskönyv"));
        System.out.println(vowels.getNumberOfVowels("sd"));
        System.out.println(vowels.getNumberOfVowels("eéáűőúőöüó"));
    }
}