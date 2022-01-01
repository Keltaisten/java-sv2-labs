package schoolrecords;

public class Mark {
    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor){
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
        checkTheInputvalue();
    }

    public Mark(String markType, Subject subject, Tutor tutor){
        this.markType = MarkType.valueOf(markType);
        this.subject = subject;
        this.tutor = tutor;
        checkTheInputvalue();
    }

    private void checkTheInputvalue() {
        if(subject == null || tutor == null){
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
    }

    public String toString(){
        return markType.getName() + "(" + markType.getGrade() + ")";
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
