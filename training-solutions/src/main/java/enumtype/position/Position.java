package enumtype.position;

public enum Position {
    DEVELOPER(300, "Cafeteria"), GROUPLEADER(3002, "Cafeteria, Mobile, Car"),
    HR(3004, "Cafeteria, Mobile"), COSTMANAGER(3000, "Cafeteria, Mobile"),
    PROJEKTMANAGER(3003, "Cafeteria, Mobile");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
