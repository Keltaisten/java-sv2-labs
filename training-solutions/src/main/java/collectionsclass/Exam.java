package collectionsclass;

import java.util.*;

public class Exam {
    private List<ExamResult> examResults;

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<ExamResult> temp = new ArrayList<>(examResults);
        Collections.sort(temp);
        Collections.reverse(temp);
        List<String> result = putNamesToNewList(temp);
        if (places <= examResults.size()) {
            result = result.subList(0,places);
        }
        return result;
    }

    private List<String> putNamesToNewList(List<ExamResult> temp) {
        List<String> result = new ArrayList<>();
        for (ExamResult actual : temp) {
            result.add(actual.getName());
        }
        return result;
    }

    public List<ExamResult> getExamResults() {
        return examResults;
    }


}
