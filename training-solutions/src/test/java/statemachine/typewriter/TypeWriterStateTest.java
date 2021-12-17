package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void nextCaps() {
        TypeWriterState typeWriterState = TypeWriterState.CAPS_LOCK;
        assertEquals(TypeWriterState.NORMAL, typeWriterState.next());
    }

    @Test
    void nextNorm(){
        TypeWriterState typeWriterState = TypeWriterState.NORMAL;
        assertEquals(TypeWriterState.CAPS_LOCK, typeWriterState.next());
    }
}