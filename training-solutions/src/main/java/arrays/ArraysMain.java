package arrays;

import java.util.Arrays;

public class ArraysMain {
    public static String numberOfDaysAsString(){

        String[] numberOfDays = new String[12];
        numberOfDays[0] = "31";
        numberOfDays[1] = "28";
        numberOfDays[2] = "31";
        numberOfDays[3] = "30";
        numberOfDays[4] = "31";
        numberOfDays[5] = "30";
        numberOfDays[6] = "31";
        numberOfDays[7] = "31";
        numberOfDays[8] = "30";
        numberOfDays[9] = "31";
        numberOfDays[10] = "30";
        numberOfDays[11] = "31";
        
        return  Arrays.toString(numberOfDays);
    }

    public static void main(String[] args) {
        System.out.println(numberOfDaysAsString());
    }
}
