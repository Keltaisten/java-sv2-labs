package controliteration.fibonacci;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    List<Long> memoList = new ArrayList<>();
    long[] lookup;

//    Original algorithm
    public List<Long> fibo(int numb){
        long fistN = 0;
        long secondN = 1;
        long thirdN;
        List<Long> listN = new ArrayList<>();
        listN.add(1l);
        for(int i = 1; i< numb;i++){
            thirdN = fistN + secondN;
            listN.add(thirdN);
            fistN = secondN;
            secondN = thirdN;
        }
        return listN;
    }
//    Recursive without memoization
    public long fibo2(int numb){
        Fibonacci fibonacci = new Fibonacci();
        if(numb<=2){
            return 1;
        }else{
            return fibonacci.fibo2(numb-1) + fibonacci.fibo2(numb-2);
        }
    }
//    Not yet finished
    public long Fibo3(int numb){
        Fibonacci fibonacci = new Fibonacci();
        List<Long> numberList = new ArrayList<>();
//        long memo;
        if(memoList.get(numb)>0){
            return memoList.get(numb);
        }
        if(numb<=2){
            return 1;
        }else{
//            memoList.add(fibonacci.Fibo3(numb-1) + fibonacci.Fibo3(numb-2));
            memoList.add(numb, fibonacci.Fibo3(numb-1) + fibonacci.Fibo3(numb-2));
            return memoList.get(numb);
        }
    }
//    public void makeMemoList(int numb){
//        for(int i = 0;i<numb;i++){
//            memoList.add((long) 0);
//        }
//    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int number = 40;
        System.out.println(LocalTime.now());
        System.out.println(fibonacci.fibo(number).get(number-1));
        System.out.println(LocalTime.now());
        System.out.println(fibonacci.fibo2(number));
        System.out.println(LocalTime.now());
        System.out.println(fibonacci.fibo4Start(number));
        System.out.println(LocalTime.now());
    }


//        Recursive with memoization
    public long fibo4(long lookup[], int number){
        if(lookup[number] == -1){
            if(number==0){
                return lookup[0];
            }
            else if(number==1){
                return  lookup[1];
            }
            else{
                lookup[number] = fibo4(lookup,number-1) + fibo4(lookup, number-2);
            }
        }
        return lookup[number];
    }

    public long fibo4Start(int numb){
        lookup = new long[numb+1];
        lookup[0] = 0;
        lookup[1] = 1;
        for(int i = 2;i<lookup.length;i++){
            lookup[i] = -1;
        }
        return fibo4(lookup,numb);
    }
}
