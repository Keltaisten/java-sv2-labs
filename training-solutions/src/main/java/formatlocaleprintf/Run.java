package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private List<Double> listRuns;
    private String name;

    public Run(String name) {
        this.name = name;
        listRuns = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRun(double km){
        listRuns.add(km);
    }

    public String printFormattedRunText(){
        LocalDate today = LocalDate.now();
        String date = String.valueOf(today);
        String s = String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!", name, date, listRuns.size(), listRuns.get(listRuns.size()-1));
        return s;
    }

    public static void main(String[] args) {
        Run run = new Run("John");
        run.addRun(12.5);
        run.addRun(15.7);
        run.addRun(10.4);
        run.addRun(16.2);
        System.out.println(run.printFormattedRunText());
    }
}
