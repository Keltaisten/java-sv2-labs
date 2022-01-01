package schoolrecords;

public enum MarkType {
    A(5, "excellent"),B(4, "very good"),
    C(3, "improvement needed"),D(2, "close fail"),
    F(1, "fail");

    private final int grade;
    private final String name;

    MarkType(int grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
}
