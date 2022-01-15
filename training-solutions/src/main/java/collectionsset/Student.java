package collectionsset;

public class Student {
    private String nameOfStudent;
    private int heightInCm;

    public Student(String nameOfStudent, int heightInCm) {
        this.nameOfStudent = nameOfStudent;
        this.heightInCm = heightInCm;
    }



    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public int getHeightInCm() {
        return heightInCm;
    }
}
