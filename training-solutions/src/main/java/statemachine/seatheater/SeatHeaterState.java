package statemachine.seatheater;

public enum SeatHeaterState {
    DEFAULT{
        @Override
        SeatHeaterState next(){
            return SeatHeaterState.MAX;
        }
    },
    MAX{
        SeatHeaterState next(){
            return SeatHeaterState.MEDIUM;
        }
    },
    MEDIUM{
        SeatHeaterState next(){
            return SeatHeaterState.MINIMUM;
        }
    },
    MINIMUM{
        SeatHeaterState next(){
            return DEFAULT;
        }
    };

    abstract SeatHeaterState next();
}
