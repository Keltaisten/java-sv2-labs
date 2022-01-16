package collectionsclass;

import java.util.*;

public class Exam {
    private List<ExamResult> examResults = new ArrayList<>();

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
//        Map<String, Integer> temp = new TreeMap<>();
//        for (ExamResult actual : examResults) {
//            temp.put(actual.getName(), actual.getResult());
//        }
////        temp = Collections.reverse(temp);
//        List<String> result = new ArrayList<>(temp.keySet());
//        Collections.sort(temp);
//        Collections.reverse(result);
//        if (places <= examResults.size()) {
//            result = new ArrayList<>(temp.keySet()).subList(0,places);
//        }
//        Collections.reverse(result);
//        return result;
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
