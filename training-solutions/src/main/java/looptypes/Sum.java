package looptypes;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public void printSums(int[] numbers){
        List<Integer> sumOfNumbers = new ArrayList<>(numbers.length-1);
        for(int i = 1; i<numbers.length;i++){
            sumOfNumbers.add(numbers[i-1]+ numbers[i]);
        }
        System.out.println(sumOfNumbers.toString());
    }

    public static void main(String[] args) {
        int[] numbers = {10,32,45,37,32,65,97,12,55};
        Sum sum = new Sum();
        sum.printSums(numbers);
    }
}
