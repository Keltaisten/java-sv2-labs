package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> teachingSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> teachingSubjects) {
        this.name = name;
        this.teachingSubjects = teachingSubjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getTeachingSubjects() {
        return teachingSubjects;
    }

    public boolean tutorTeachingSubject(Subject subject){
        boolean check = false;
        for(Subject sub: teachingSubjects){
            if(subject.getSubjectName().equals(sub.getSubjectName())){
                check = true;
            }
        }

        return check;
    }
}
