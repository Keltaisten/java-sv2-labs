package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Person> checkedInPeople = new ArrayList<>();

    public void addPerson(Person person){
        checkedInPeople.add(person);
    }

    public List<Person> getCheckedInPeople() {
        return checkedInPeople;
    }
}
