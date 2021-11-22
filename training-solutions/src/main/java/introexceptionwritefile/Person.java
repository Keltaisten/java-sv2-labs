package introexceptionwritefile;

public class Person {
    private String name;
    private int dateOfBirth;

    public Person(String name, int dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person " +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth;
    }
}
