package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void modify() {
        ModifiedWord modifiedWord = new ModifiedWord()
                .modify("word")
                .checkTheWordLongerThanThreeCharacter()
                .makeTheFirstLetterCapital()
                .changeTheSecondLetter()
                .makeTheThirdLetterCapital()
                .changeTheFourthLetter();
        assertEquals("WxRy", modifiedWord.getWord());
    }

    @Test
    void isTheArrayEmpty() {
        ModifiedWord modifiedWord = new ModifiedWord()
                .modify("word");
//        assertThrows(modifiedWord.checkTheWordLongerThanThreeCharacter());
    }

}