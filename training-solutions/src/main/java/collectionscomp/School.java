package collectionscomp;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class School {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());
        Student student1 = new Student("John",190);
        Student student2 = new Student("Jane",167);
        Student student3 = new Student("Jetta",165);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

//        Set<Student> students2 = new TreeSet<>();
//        students2.add(student1);
//        students2.add(student2);
//        students2.add(student3);
//        System.out.println(students2);
    }
}
