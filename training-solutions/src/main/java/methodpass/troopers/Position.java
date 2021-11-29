package methodpass.troopers;

public class Position {
    private double posX;
    private double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double distanceFrom(Position position){
        return Math.sqrt(Math.pow((this.posX - position.getPosX()),2) + Math.pow((this.posY - position.getPosY()),2));
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
