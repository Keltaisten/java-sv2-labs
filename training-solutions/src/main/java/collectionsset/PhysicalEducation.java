package collectionsset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {
    public Set<Integer> getOrderInLessons(List<Student> students){
        Set<Integer> result = new TreeSet<>();
        for(Student student : students){
            result.add(student.getHeightInCm());
        }
        return result;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John",178));
        students.add(new Student("Jack",210));
        students.add(new Student("Jane",165));
        students.add(new Student("Jetta",162));
        students.add(new Student("Joe",174));
        PhysicalEducation pe = new PhysicalEducation();
        System.out.println(pe.getOrderInLessons(students));
    }
}
