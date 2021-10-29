package enumtype.position;

import java.util.Arrays;

public class PositionMain {
    public static void main(String[] args) {
        System.out.println(Position.valueOf("HR"));
        System.out.println(Arrays.toString(Position.values()));
        System.out.println(Position.HR);
        System.out.println(Position.DEVELOPER.getSalary());
        System.out.println(Position.GROUPLEADER.getBenefit());
        Position[] position = Position.values();
        System.out.println(Arrays.toString(position));
    }
}
