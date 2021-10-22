package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class EveryThird {
    public int[] changeToZero(int[] numbers){
        for(int i = numbers.length-1;i>=0;i-=3){
            numbers[i] = 0;
        }
        return numbers;
    }

    public static void main(String[] args) {
        EveryThird everyThird = new EveryThird();
        int[] numbers = {2,4,6,8,1,5,3,5,6,4,8,9,7,5,2};
        List<Integer> zero = new ArrayList<>();
        for(int i: everyThird.changeToZero(numbers)){
            zero.add(i);
        }
        System.out.println(zero.toString());
    }
}
