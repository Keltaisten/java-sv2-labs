package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {
    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable){
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute){
        for(int i = firstHour; i <= lastHour; i++){

            timeTable.add(new SimpleTime(i,everyMinute));
        }
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime getNextBus(SimpleTime actual){
        int minimumTime = 1_000;
        SimpleTime nextBusTime = null;
        for(SimpleTime st: timeTable){
            if(st.getMinutesPlusHours() - actual.getMinutesPlusHours() >= 0){
                if(st.getDifference(actual) < minimumTime){
                    minimumTime = st.getDifference(actual);
                    nextBusTime = st;
                }
            }
        }
        if(nextBusTime == null){
            throw new IllegalStateException("No more buses today!");
        }
        return nextBusTime;
    }
}
