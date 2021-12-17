package statemachine.typewriter;

public enum TypeWriterState {
    CAPS_LOCK{
        @Override
        TypeWriterState next(){
            return NORMAL;
        }
    },
    NORMAL{
        @Override
        TypeWriterState next() {
            return CAPS_LOCK;
        }
    };

    abstract TypeWriterState next();
}
