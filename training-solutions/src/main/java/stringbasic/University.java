package stringbasic;

public class University {
    public boolean areEqual(Student student, Student anotherStudent){
        boolean bool = false;
        if(student.getEducationalIdentification().equals(anotherStudent.getEducationalIdentification()) &&
                student.getNeptunCode().equals(anotherStudent.getNeptunCode()))
        {
            bool = true;
        }
        return bool;
    }

    public static void main(String[] args) {
        University university = new University();
        Student student = new Student(new Person("Jonh","John@Doe.hu","JD4578",
                "102567324542","06208786452"),"4538AD","UZ543KJ125");
        Student anotherStudent = new Student(new Person("Jane","Jane@Doe.hu","JD4578",
                "102567324542","06208786452"),"4538AD","UZ543KJ125");
        System.out.println(university.areEqual(student,anotherStudent));
        anotherStudent.setNeptunCode("6782ER");
        System.out.println(university.areEqual(student,anotherStudent));
    }
}
