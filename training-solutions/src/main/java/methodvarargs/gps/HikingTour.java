package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {
    private List<FieldPoint> fieldPoints = new ArrayList<>();

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog){
        if(timeOfLogging != null){
            for(FieldPoint fp: fieldPointsToLog){
                fp.setTimeOfLogging(timeOfLogging);
                fieldPoints.add(fp);
            }
        }
        else{
            throw new IllegalArgumentException("The logging time is null");
        }
    }

    public List<FieldPoint> getFieldPoints() {
        return fieldPoints;
    }
}
