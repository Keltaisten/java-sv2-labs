package controliteration.fibonacci;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    List<Long> memoList = new ArrayList<>();

    public List<Long> Fibo(int numb){
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

    public long Fibo2(int numb){
        Fibonacci fibonacci = new Fibonacci();
        if(numb<=2){
            return 1;
        }else{
            return fibonacci.Fibo2(numb-1) + fibonacci.Fibo2(numb-2);
        }
    }

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

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
//        fibonacci.makeMemoList(6);
//        fibonacci.memoList.add((long) 0);
//        System.out.println();
//        System.out.println(fibonacci.Fibo(5));
//        System.out.println(fibonacci.Fibo2(5));
//        System.out.println(LocalTime.now());
////        System.out.println(fibonacci.Fibo2(50));
//        System.out.println(LocalTime.now());
//        System.out.println(fibonacci.Fibo(70).get(69));
//        System.out.println(LocalTime.now());
//        System.out.println(fibonacci.Fibo3(5));
//        System.out.println(LocalTime.now());
        int numb = 5;
        int[] lookup = new int[numb];
        lookup[0] = 0;
        lookup[1] = 1;
        for(int i = 2;i<lookup.length;i++){
            lookup[i] = -1;
        }

        System.out.println(fibonacci.fibo4(lookup,numb));
        System.out.println(Arrays.toString(lookup));
    }

    public void makeMemoList(int numb){
        for(int i = 0;i<numb;i++){
            memoList.add((long) 0);
        }
    }

    public int fibo4(int lookup[], int number){
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
}
