package recursion;

import java.util.Arrays;
import java.util.List;

public class Numbers {
    public int getSum(int[] numbers){
        if(numbers.length == 0){
            return 0;
        }
        else if(numbers.length == 1){
            return numbers[0];
        }
        else{
            return numbers[0] + getSum(Arrays.copyOfRange(numbers,1,numbers.length));
//            int result = numbers[numbers.length - 1];
//            return getSum(Arrays.copyOfRange(numbers,0,numbers.length - 1));
        }
    }

    public static void main(String[] args) {
        int[] res = new int[]{1, 2, 3, 4};
        System.out.println(res.length);
//        int number = Arrays.stream(res).sum();
        int number = res[res.length-1];
        System.out.println(number);
        int[] ress = Arrays.copyOfRange(res,0,res.length - 1);
        System.out.println(number);
    }
}
