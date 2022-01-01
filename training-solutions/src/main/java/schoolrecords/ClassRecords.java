package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student) {
        boolean notContinues = true;
        for (Student actual : students) {
            if (actual.getName().equals(student.getName())) {
                notContinues = false;
            }
        }
        if (notContinues) {
            students.add(student);
        }
        return notContinues;
    } // felvesz egy diákot az osztályba

    public boolean removeStudent(Student student) {
        boolean continues = false;
        for (Student actual : students) {
            if (actual.getName().equals(student.getName())) {
                continues = true;
            }
        }
        if (continues) {
            students.remove(student);
        }
        return continues;
    }

    public double calculateClassAverage() {
        double ave = 0;
        for (Student student : students) {
            ave += student.calculateAverage();
        }
        if (!students.isEmpty()) {
            if (ave / students.size() != 0) {
                return ave / students.size();
            } else {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
        } else {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
    } //osztályátlagot számol, minden diákot figyelembe véve

    public double calculateClassAverageBySubject(Subject subject) {
        double ave = 0;
        int count = 0;
        for (Student student : students) {
            if (student.calculateSubjectAverage(subject) != 0.0) {
                ave += student.calculateSubjectAverage(subject);
                count++;
            }
        }
        if (!students.isEmpty()) {
            return ave / count;
        } else {
            return 0.0;
        }
    } //tantárgy szerinti osztályátlagot számol,

    // kihagyja azon diákokat, akiknek az adott tantárgyból nincs jegye
    public Student findStudentByName(String name) {
        Student actualStudent = null;
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
        if (isEmpty(name)) {
            for (Student student : students) {
                if (student.getName().equals(name)) {
                    actualStudent = student;
                }
            }
        }
        if (actualStudent == null) {
            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        }
        return actualStudent;
    } // név szerint megkeres egy diákot az osztályban

    private boolean isEmpty(String str) {
        if (str == "" || str == null) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        return true;
    }

    public Student repetition() {
        if (students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        int rand = random.nextInt(1, students.size());
        Student student = students.get(rand);
        return student;
    } //felelethez a listából random módon kiválaszt egy diákot

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> studyResultByNames = new ArrayList<>();
        for (Student student : students) {
            studyResultByNames.add(new StudyResultByName(student.getName(), student.calculateAverage()));
        }
        return studyResultByNames;
    } //a diákok nevét és tanulmányi átlagát egy-egy új objektumba viszi,

    // és azok listáját adja vissza
    public String listStudentNames() {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bool = true;
        for (Student student : students) {
            if (bool) {
                bool = false;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append(student.getName());
        }
        return String.valueOf(stringBuilder);
    } //kilistázza a diákok neveit, vesszővel elválasztva
}
