package collectionscomp;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private int height;

    public Student(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getHeight(),o2.getHeight());
    }
}
