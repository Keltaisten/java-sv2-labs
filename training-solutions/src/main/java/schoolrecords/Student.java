package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Student {
    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        checkName();
    }

    private void checkName() {
        if(name.trim().equals("")){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
    }

    public void grading(Mark mark){
        checkMark(mark);
        marks.add(mark);
    }

    private void checkMark(Mark mark) {
        if(mark == null){
            throw new NullPointerException("Mark must not be null!");
        }
    }

    public double calculateAverage(){
        double average = 0;
        for(Mark mark: marks){
            average += mark.getMarkType().getGrade();
        }
//        return marks.size()!= 0 ? average / marks.size() : 0.0;
        double setTwoDecimals;
        if(!marks.isEmpty()){
            setTwoDecimals = ((double) Math.round((average / marks.size()) * 100)) / 100;
        }
        else{
            setTwoDecimals = 0.0;
        }
        return setTwoDecimals;
    }

    public double calculateSubjectAverage(Subject subject) {
        double average = 0;
        double count = 0;
        for (Mark mark : marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                average += mark.getMarkType().getGrade();
                count++;
            }
        }
        double setTwoDecimals;
        if(count != 0){
//            setTwoDecimals = ((double) Math.round((average / count) * 100)) / 100;
            double num = average / count;
            setTwoDecimals = Double.parseDouble(String.format(Locale.US,"%.2f", num));
        }
        else{
            setTwoDecimals = 0.0;
        }

        return setTwoDecimals;
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder().append(name);
        for(Mark mark : marks){
            stringBuilder.append(" marks: " + mark.getSubject().getSubjectName() + ": " + mark.toString());
        }
        return String.valueOf(stringBuilder);
    }

    public String getName() {
        return name;
    }
}
