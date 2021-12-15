package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {
    Vaccine vaccine;
    List<Person> registrated = new ArrayList<>();

    @BeforeEach
    void init() {
        registrated.add(new Person("Joe", 22, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Jane", 30, ChronicDisease.NO, Pregnancy.YES));
        registrated.add(new Person("John", 70, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Josephine", 25, ChronicDisease.NO, Pregnancy.YES));
        registrated.add(new Person("Jack", 72, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Jabba", 40, ChronicDisease.NO, Pregnancy.NO));
    }

    @Test
    void FirstVaccineTest() {
        vaccine = new FirstVaccine();
        vaccine.generateVaccinationList(registrated);
        assertEquals("Josephine", vaccine.getVaccinationList().get(1).getName());
    }

    @Test
    void FirstVaccineTest2() {
        vaccine = new FirstVaccine();
        vaccine.generateVaccinationList(registrated);
        assertEquals("Jack", vaccine.getVaccinationList().get(2).getName());
    }

    @Test
    void SecondVaccineTest() {
        vaccine = new SecondVaccine();
        vaccine.generateVaccinationList(registrated);
        assertEquals(3, vaccine.getVaccinationList().size());
    }

    @Test
    void SecondVaccineTest2() {
        vaccine = new SecondVaccine();
        vaccine.generateVaccinationList(registrated);
        assertEquals("Jabba", vaccine.getVaccinationList().get(1).getName());
    }
}