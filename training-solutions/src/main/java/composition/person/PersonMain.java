package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("John", "QU453288");
        Address address = new Address("England","Birminghan","High str. 78.", "5500");
        System.out.println(person.personToString());
        System.out.println(address.addressToString());

        person.correctData("Jane", "AS123456");
        System.out.println(person.personToString());
        address.correctData("Japan", "Tokyo", "Dragon str. 1115.", "QW6420");
        System.out.println(address.addressToString());
    }
}
