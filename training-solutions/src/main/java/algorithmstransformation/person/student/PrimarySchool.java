package algorithmstransformation.person.student;

import algorithmstransformation.person.Person;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    private List<Person> personList = new ArrayList<>();

    public PrimarySchool(List<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person){
        personList.add(person);
    }

    public List<Student> getStudents(){
        List<Student> studentList = new ArrayList<>();
        for(Person p: personList){
            if(p.getAge() <= 18){
            studentList.add(new Student(p.getName(),p.getAddress()));
            }
        }
        return studentList;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
