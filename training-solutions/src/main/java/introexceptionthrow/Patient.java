package introexceptionthrow;

public class Patient {
    private String name;
    private String socialSecurityNumber;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;

        if(name == null || name == ""){
            throw new IllegalArgumentException("The name is not given");
        }
        if(yearOfBirth < 1900){
            throw new IllegalArgumentException("The year is older than 1900");
        }
    }

    public static void main(String[] args) {
        Patient patient = new Patient("Jane", "sdf34",1995);
        Patient patient2 = new Patient("", "sdere324",1985);
        Patient patient3 = new Patient("Jack", "dfs324ef",190);
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    private int yearOfBirth;
}
