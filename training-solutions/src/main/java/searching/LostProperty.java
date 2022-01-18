package searching;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty> {
    private String registrationNumber;
    private String shortDescription;
    private LocalDate foundDate;

    public LostProperty(String registrationNumber, String shortDescription, LocalDate foundDate) {
        this.registrationNumber = registrationNumber;
        this.shortDescription = shortDescription;
        this.foundDate = foundDate;
    }

    public LostProperty(String shortDescription, LocalDate foundDate) {
        this.shortDescription = shortDescription;
        this.foundDate = foundDate;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public LocalDate getFoundDate() {
        return foundDate;
    }

    @Override
    public int compareTo(LostProperty o) {
        if (shortDescription.compareTo(o.shortDescription) != 0) {
            return shortDescription.compareTo(o.shortDescription);
        } else {
            return foundDate.compareTo(o.foundDate);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostProperty that = (LostProperty) o;
        return Objects.equals(shortDescription, that.shortDescription) && Objects.equals(foundDate, that.foundDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortDescription, foundDate);
    }
}
