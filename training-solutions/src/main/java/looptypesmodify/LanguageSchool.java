package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
    List<Student> study = new ArrayList<>();
    List<Student> block = new ArrayList<>();

    Student student1 = new Student();
    student1.name = "Adam";
    Student student2 = new Student();
    student2.name = "Csilla";
    Student student3 = new Student();
    student3.name = "Theodor";

    study.add(student1);
    study.add(student2);
    study.add(student3);

    student3.setActive(false);
    
    for(Student i: study){
        if(i.isActive() == true){
            block.add(i);
        }
    }
        System.out.println(study.size());
        System.out.println(block.size());
    }

}
