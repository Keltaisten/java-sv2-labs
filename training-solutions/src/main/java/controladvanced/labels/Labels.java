package controladvanced.labels;

import java.util.Arrays;

public class Labels {
    public int[][] getTableOfNumbers(int number) {
        int[][] table = new int[number][number];
        table[0][0] = 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                table[i][j] = (i + 1) + (j + 1);
                if(table[i][j] == 6){
                    break;
                }
            }
        }
        return table;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Labels().getTableOfNumbers(5)));
    }
}
