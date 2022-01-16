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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResult that = (ExamResult) o;
        return result == that.result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        return "ExamResult{" +
                "name='" + name + '\'' +
                ", result=" + result +
                '}';
    }
}
