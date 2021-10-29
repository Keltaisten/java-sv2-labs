package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Hógolyó", 3,"fehér");
        Dog dog2 = new Dog("Pacsi", 2,"fekete");
        dogs.add(dog1);
        dogs.add(dog2);


    }
}