package abstractclass.gamecharacter;

public class Point {
    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long getDistance(Point otherPoint){
        long a = Math.abs(x - otherPoint.x);
        long b = Math.abs(y - otherPoint.y);

        return (long) Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
}
