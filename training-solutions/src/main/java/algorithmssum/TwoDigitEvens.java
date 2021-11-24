package algorithmssum;

import java.util.List;

public class TwoDigitEvens {
    public int getSum(){
        int sum = 0;
        for(int i = 10; i < 100;i++){
            if(i%2 == 1 && i%5 != 0){
                sum += i;
            }
        }
        return sum;
    }
}
