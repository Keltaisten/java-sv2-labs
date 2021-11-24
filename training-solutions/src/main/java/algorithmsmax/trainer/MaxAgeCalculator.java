package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public int getTrainerWithMaxAge(List<Trainer> trainersList){
        int maxAge = trainersList.get(0).getAge();
        for(Trainer t: trainersList){
            if(t.getAge() > maxAge){
                maxAge = t.getAge();
            }
        }
        return maxAge;
    }

//    public void addToTrainerList(Trainer train){
//        trainersList.add(train);
//    }
}
