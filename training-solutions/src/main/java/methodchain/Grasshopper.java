package methodchain;

public class Grasshopper {
    private int position = 0;

    public Grasshopper hopOnce(Direction direction){
        if(direction.name().equals(Direction.POSITIVE.name())){
            position++;
        }
        else if(direction.equals(Direction.NEGATIVE)){
            position--;
        }
        return this;
    }

    public void moveFromZeroToThreeWithFiveHops(){
        this
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.NEGATIVE)
                .hopOnce(Direction.POSITIVE);
    }

    public int getPosition() {
        return position;
    }
}
