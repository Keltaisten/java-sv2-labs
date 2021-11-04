package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Hógolyó", 3,"fehér");
        Dog dog2 = new Dog("Pacsi", 2,"fekete");
        Dog dog3 = new Dog("Bogyó", 4,"foltos");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dogs.toString());
        Dog dog4 = dogs.get(1);
        dog4.setColour("barna");
        System.out.println(dogs.toString());
        Dog dog5 = new Dog("Csatár", 1,"világosbarna");
        System.out.println(dog5);
        dog5 = dogs.get(1);
        System.out.println(dog5);
        dogs.add(dog5);
        System.out.println(dogs.toString());
        Dog dog6 = dog4;
        dog6.setColour("szürke");
        System.out.println(dogs.toString());
        List<Dog> dogs2 = dogs;
        Dog dog7 = dog4;
        dog7.setColour("kék");
        System.out.println(dogs2.toString());
        dog2.setColour("sötétbarna");
        System.out.println(dogs2.toString());
        dog2 = null;
        System.out.println(dogs2.toString());
        Dog dog8 = dogs.get(1);
        dog8 = null;
        System.out.println(dogs2.toString());
        Dog dog9 = dogs.get(1);
        dog9.setColour("foltos barna");
        System.out.println(dogs2.toString());
    }
}