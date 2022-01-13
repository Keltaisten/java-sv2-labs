package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {
    public Queue<Integer> getVaccinationOrder(List<Person> people){
        Queue<Integer> vaccine = new PriorityQueue<>();
        for(Person person: people){
            if(person.getAge() >= 18 || person.getAge() <= 65){
                vaccine.add(person.getAge());
            }
        }
        return vaccine;
    }

    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        List<Person> people = new ArrayList<>();
        people.add(new Person("John",35));
        people.add(new Person("Jack",20));
        people.add(new Person("Jane",70));
        people.add(new Person("Jetta",5));
        people.add(new Person("Joe",60));
        people.add(new Person("Jaime",32));

        Queue<Integer> vacc = vaccination.getVaccinationOrder(people);
        System.out.println(vacc);
        System.out.println(vacc.poll());
        System.out.println(vacc.poll());
        System.out.println(vacc.poll());
    }
}
