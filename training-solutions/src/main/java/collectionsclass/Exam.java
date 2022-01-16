package collectionsclass;

import java.util.*;

public class Exam {
    private List<ExamResult> examResults = new ArrayList<>();

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<ExamResult> temp = examResults;
        Collections.sort(temp);
        Collections.reverse(temp);
        List<String> result = new ArrayList<>();
        for (ExamResult actual : examResults) {
            result.add(actual.getName());
        }
        if (places <= examResults.size()) {
            result = result.subList(0,places);
        }
        return result;
    }

    public List<ExamResult> getExamResults() {
        return examResults;
    }
}
