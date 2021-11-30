package methodvarargs.examstats;

import java.util.Arrays;

public class ExamStats {
    private int maxPoints;

    public ExamStats(int maxPoints){
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results){
        checkTheArrayEmpty(results);
        int sum = 0;
        for(int i: results){
            if(i > limitInPercent){
                sum++;
            }
        }
        return sum;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results){
        checkTheArrayEmpty(results);
        boolean bool = false;
        for(int i: results){
            if(i < limitInPercent){
                bool = true;
            }
        }
        return bool;
    }

    private void checkTheArrayEmpty(int... results){
        if(results == null || results.length == 0){
            throw new IllegalArgumentException("The array is empty");
        }
    }
}
