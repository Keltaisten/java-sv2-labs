package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> peopleOfTown, int members){
        boolean exists = false;
        int step = 0;
        while (!exists && step < peopleOfTown.size()){
            if(peopleOfTown.get(step) < members){
                exists = true;
            }
            step++;
        }
        return exists;
    }
}
