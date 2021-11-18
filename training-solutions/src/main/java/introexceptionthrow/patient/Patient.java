package introexceptionthrow.patient;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    SsnValidator ssnValidator = new SsnValidator();

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
        if(!(ssnValidator.IsValidSsn(socialSecurityNumber))){
            throw new IllegalArgumentException("The social security number is not valid");
        }
    }

    public static void main(String[] args) {
        Patient patient5 = new Patient("Jack", "100000007",1901);
        Patient patient = new Patient("Jane", "010000003",1995);
        Patient patient2 = new Patient("we", "pg",1985);
        Patient patient3 = new Patient("Jack", "564578945",1901);
        Patient patient4 = new Patient("Jack", "564578945",1901);
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
