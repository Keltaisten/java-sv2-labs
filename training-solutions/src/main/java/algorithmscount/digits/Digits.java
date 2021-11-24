package algorithmscount.digits;

import java.util.List;

public class Digits {
    public int getCountOfNumbers(){
        int count = 0;
        for(int i = 10; i < 100;i++){
            if(isItBiggerWithFive(i) || isItBiggerWithFiveOtherMethod(i)){
                count++;
            }
        }
        return count;
    }

    public boolean isItBiggerWithFive(int i){
        String convertI = String.valueOf(i);
        return (convertI.charAt(1) + 5) == convertI.charAt(0);
    }

    public boolean isItBiggerWithFiveOtherMethod(int i){
        String convertI = String.valueOf(i);
        return (convertI.charAt(0) + 5) == convertI.charAt(1);
    }
}
