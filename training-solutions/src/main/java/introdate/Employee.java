package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    String name;
    LocalDate dateOfBirth;
    LocalDateTime beginEmployment;

    public Employee(String name, LocalDate dateOfBirth, LocalDateTime beginEmployment) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.beginEmployment = beginEmployment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDateTime getBeginEmployment() {
        return beginEmployment;
    }


}
