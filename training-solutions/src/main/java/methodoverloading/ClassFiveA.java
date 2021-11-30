package methodoverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassFiveA {
    List<String> students = Arrays.asList("Gárdos Helga", "Joó Lilla", "Kiss József", "Nagy Béla",
            "Németh Dóra", "Pongrácz Imola", "Rendes Richárd", "Szabó Nóra", "Takács Júlia", "Vígh Elemér");

    public String getTodayReferringStudent(int number){
        return students.get(number - 1);
    }

    public String getTodayReferringStudent(Number number){
        return students.get(number.ordinal());
    }

    public String getTodayReferringStudent(String numberName){
        return students.get(Number.valueOf(numberName.toUpperCase()).ordinal());
    }
}
