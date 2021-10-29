package enumtype.position;

public enum Position {
    DEVELOPER(300, "Cafeteria"), GROUPLEADER(3002, "Cafeterias"),
    HR(3004, "Cafeteriad"), COSTMANAGER(3000, "Cafeteriaq"),
    PROJEKTMANAGER(3003, "Cafeteriaa");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }
}
