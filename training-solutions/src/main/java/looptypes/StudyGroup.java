package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public void printStudyGroups(List<String> students){
        List<String> groupUnderOrEqualTen = new ArrayList<>();
        List<String> groupAboveTen = new ArrayList<>();

        for(int i = 0; i< students.size(); i++){
            //Ha a név 10 betűből állhat akkor nem 11-re kell vizsgálni a szóköz miatt?
            if(students.get(i).length()<=11){
                groupUnderOrEqualTen.add(students.get(i));
            }
            else{
                groupAboveTen.add(students.get(i));
            }
        }
        System.out.println("Egyes csoport tagjai: " + groupUnderOrEqualTen.toString());
        System.out.println("Kettes csoport tagjai: " + groupAboveTen.toString());
    }

    public static void main(String[] args) {
        List<String> students = new ArrayList<>(Arrays.asList("Nevem Senki", "Tere Fere", "Banános Joe", "James Bond",
                "Terence Hill", "Erős Pista", "Hentes Mária", "Fekete Kiara"));
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.printStudyGroups(students);
    }
}
