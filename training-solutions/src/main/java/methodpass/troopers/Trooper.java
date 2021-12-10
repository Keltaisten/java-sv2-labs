package methodpass.troopers;

public class Trooper {
    private String name;
    private Position position = new Position(0,0);

    public Trooper(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
    }

    public void changePosition(Position target){
        if (target == null) {
            throw new IllegalArgumentException("The new position must not be null");
        }
        position = target;
    }

    public double distanceFrom(Position target){
        return position.distanceFrom(target);
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
