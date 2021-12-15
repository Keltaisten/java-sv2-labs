package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        int step = 0;
        for (Person person : registrated) {
            if (person.getPregnant() == Pregnancy.NO && person.getChronic() == ChronicDisease.NO) {
                if (person.getAge() <= 65) {
                    vaccinationList.add(step, person);
                    step++;
                } else {
                    vaccinationList.add(person);
                }
            }
        }
    }
}
