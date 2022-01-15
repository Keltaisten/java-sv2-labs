package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {
    private String address;
    private Integer numberOfLevels;

    public Building(String address, Integer numberOfLevels) {
        this.address = address;
        this.numberOfLevels = numberOfLevels;
    }

    @Override
    public int compareTo(Building o) {
        return numberOfLevels.compareTo(o.numberOfLevels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(numberOfLevels, building.numberOfLevels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfLevels);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", numberOfLevels=" + numberOfLevels +
                '}';
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Székesfehérvár",2));
        buildings.add(new Building("Szeged",4));
        buildings.add(new Building("Szigetszentmiklós",1));
        buildings.add(new Building("Budapest",3));
        buildings.add(new Building("Ajka",7));
        System.out.println(buildings);
    }
}
