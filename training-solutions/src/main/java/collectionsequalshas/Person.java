package collectionsequalshas;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int insuranceCardNumber;

    public Person(String name, int age, int insuranceCardNumber) {
        this.name = name;
        this.age = age;
        this.insuranceCardNumber = insuranceCardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return insuranceCardNumber == person.insuranceCardNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(insuranceCardNumber);
    }

    public static void main(String[] args) {
        Person p1 = new Person("John Doe",30,365870120);
        Person p2 = new Person("Jack Doe",32,365870120);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getInsuranceCardNumber() {
        return insuranceCardNumber;
    }
}
