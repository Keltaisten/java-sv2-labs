package algorithmsmax.temperature;

import java.util.List;

public class Temperature {
    public int getMin(List<Integer> temperatureList){
        int number = temperatureList.get(0);
        for(Integer i: temperatureList){
            if(i < number){
                number = i;
            }
        }
        return number;
    }
}
