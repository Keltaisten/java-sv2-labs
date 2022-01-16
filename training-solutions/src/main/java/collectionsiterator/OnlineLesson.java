package collectionsiterator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class OnlineLesson {
    private String nameOfTeacher;
    private String nameOfLesson;
    private LocalDateTime startOfLesson;

    public OnlineLesson(String nameOfTeacher, String nameOfLesson, LocalDateTime startOfLesson) {
        this.nameOfTeacher = nameOfTeacher;
        this.nameOfLesson = nameOfLesson;
        this.startOfLesson = startOfLesson;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public String getNameOfLesson() {
        return nameOfLesson;
    }

    public LocalDateTime getStartOfLesson() {
        return startOfLesson;
    }
}
