package collectionsset;

import java.util.Objects;

public class RightAnswer {
    private String nameOfTheWinner;

    public RightAnswer(String nameOfTheWinner) {
        this.nameOfTheWinner = nameOfTheWinner;
    }

    public String getNameOfTheWinner() {
        return nameOfTheWinner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RightAnswer that = (RightAnswer) o;
        return Objects.equals(nameOfTheWinner, that.nameOfTheWinner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheWinner);
    }
}
