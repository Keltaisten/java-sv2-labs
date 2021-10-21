package arrays;

import java.lang.reflect.Array;
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

    public static String multiplicationTableAsString(int size){
        int[][] table = new int[size][size];
        for(int rows = 0; rows< size;rows++){
            for(int col = 0;col<size;col++){
                table[rows][col] = (rows+1)*(col+1);
//                System.out.print(table[rows][col] + " ");
            }
//            System.out.println();
        }
        return Arrays.deepToString(table);
    }

    public static boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day,anotherDay);
    }

    public static boolean sameTempValuesDaylight(double[] day, double[] anotherDay){
        double[] shorterDay = min(day,anotherDay);
        double[] modifiedDay = Arrays.copyOfRange(day,0,shorterDay.length);
        double[] modifiedAnotherDay = Arrays.copyOfRange(anotherDay,0,shorterDay.length);

        return Arrays.equals(modifiedDay,modifiedAnotherDay);
    }

    private static double[] min(double[] i, double[] i1) {
        return i.length<=i1.length ? i: i1;
    }

    public static boolean wonLottery(int[] choosenLottery, int[] myLottery){
        int[] choosenLotteryCopy = Arrays.copyOf(choosenLottery,choosenLottery.length);
        int[] myLotteryCopy = Arrays.copyOf(myLottery,myLottery.length);

        Arrays.sort(choosenLotteryCopy);
        Arrays.sort(myLotteryCopy);
        return Arrays.equals(choosenLotteryCopy,myLotteryCopy);
    }


    public static void main(String[] args) {
        System.out.println("numberOfDaysAsString:");
        System.out.println(numberOfDaysAsString());

        System.out.println("multiplicationTableAsString:");
        System.out.println(multiplicationTableAsString(5));

        double[] day = {25.2, 24};
        double[] anotherDay = {25.2, 24};
        System.out.println("sameTempValues:");
        System.out.println(sameTempValues(day, anotherDay));

        double[] day2 = new double[3];
        double[] anotherDay2 = new double[5];
        day2[0] = 25.5;
        day2[1] = 25.6;
        day2[2] = 25.4;
        anotherDay2[0] = 25.5;
        anotherDay2[1] = 25.6;
        anotherDay2[2] = 25.4;
        anotherDay2[3] = 25.4;
        anotherDay2[4] = 25.4;
        System.out.println("sameTempValuesDaylight:");
        System.out.println(sameTempValuesDaylight(day2, anotherDay2));

        int[] choosenLottery = {5,4,3,2,1};
        int[] myLottery= {2,1,3,4,5};
        String wonOrLose = wonLottery(choosenLottery,myLottery)? "Nyert": "Nem nyert";
        System.out.println("wonLottery:");
        System.out.println(wonOrLose);
        System.out.println(Arrays.toString(choosenLottery));
        System.out.println(Arrays.toString(myLottery));

    }


}
