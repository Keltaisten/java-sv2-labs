package collectionsclass;

import java.util.Objects;

public class ExamResult implements Comparable<ExamResult> {
    private String name;
    private Integer result;

    public ExamResult(String name, int result) {
        this.name = name;
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(ExamResult o) {
        return result.compareTo(o.result);
    }

}
