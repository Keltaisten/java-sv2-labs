package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {
    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> comments = new ArrayList<>();

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public Issue(Issue other, CopyMode otherEnum) {
        name = other.name;
        time = other.time;
        status = other.status;
        settingCommentsByEnum(other, otherEnum);
    }

    private void settingCommentsByEnum(Issue other, CopyMode otherEnum) {
        if (otherEnum.equals(CopyMode.WITH_COMMENTS)) {
            for (Comment actual : other.comments) {
                comments.add(new Comment(actual));
            }
        }
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
