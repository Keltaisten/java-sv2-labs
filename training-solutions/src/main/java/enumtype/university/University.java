package enumtype.university;

public enum University {
    OE("ÓbudaiEgyetem"), SZOTE("SzegediOrvosTudományiEgyetem"),
    BME("BudapestiMűsakiEgyetem"), SOTE("SemmelweisOrvosTudományiEgyetem");

    private final String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
