package algorithmsfilter.animal.zoo;

import algorithmsfilter.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animalList = new ArrayList<>();

    public Zoo(Animal animal){
        animalList.add(animal);
    }

    public void addAnimal(Animal animal){
        animalList.add(animal);
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs){
        List<Animal> filteredAnimalList = new ArrayList<>();
        for(Animal a: animalList){
            if(a.getNumberOfLegs() == numberOfLegs){
                filteredAnimalList.add(a);
            }
        }
        return filteredAnimalList;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }
}
