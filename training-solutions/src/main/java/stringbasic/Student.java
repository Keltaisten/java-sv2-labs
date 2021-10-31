package stringbasic;

public class Student {
    private Person person;
    private String neptunCode;
    private String educationalIdentification;
    private String entryCardNumber;

    public Student(Person person, String neptunCode, String educationalIdentification) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.educationalIdentification = educationalIdentification;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public String getEducationalIdentification() {
        return educationalIdentification;
    }

    public void setEducationalIdentification(String educationalIdentification) {
        this.educationalIdentification = educationalIdentification;
    }

    public String getEntryCardNumber() {
        return entryCardNumber;
    }

    public void setEntryCardNumber(String entryCardNumber) {
        this.entryCardNumber = entryCardNumber;
    }
}
