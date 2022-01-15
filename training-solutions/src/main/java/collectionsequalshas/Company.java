package collectionsequalshas;

import java.util.Objects;

public class Company {
    private String nameOfCompany;
    private String number;

    public Company(String nameOfCompany, String number) {
        this.nameOfCompany = nameOfCompany;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(nameOfCompany, company.nameOfCompany) && Objects.equals(number, company.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfCompany, number);
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public String getNumber() {
        return number;
    }
}
