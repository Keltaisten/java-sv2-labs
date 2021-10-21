package arrayofarrays;

public class DailyValues {
    public static int[][] getValues(){
        int[][] days = new int[12][];
        days[0] = new int[31];
        days[1] = new int[28];
        days[2] = new int[31];
        days[3] = new int[30];
        days[4] = new int[31];
        days[5] = new int[30];
        days[6] = new int[31];
        days[7] = new int[31];
        days[8] = new int[30];
        days[9] = new int[31];
        days[10] = new int[30];
        days[11] = new int[31];

        return days;
    }

    public static void main(String[] args) {
        ArrayOfArrays arrays = new ArrayOfArrays();
        arrays.printArrayOfArrays(getValues());
    }
}
