package controliteration.fibonacci;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    public List<Integer> Fibo(int numb){
        int fistN = 0;
        int secondN = 1;
        int thirdN;
        List<Integer> listN = new ArrayList<>();
        listN.add(1);
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

    public int Fibo3(int numb){
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> numberList = new ArrayList<>();
        int memo;
        if(numberList.contains(numb)){
            memo = numberList.get(numberList.indexOf(numb));
        }
        if(numb<=2){
            return 1;
        }else{
            numberList.add(fibonacci.Fibo3(numb-1) + fibonacci.Fibo3(numb-2));
            return fibonacci.Fibo3(numb-1) + fibonacci.Fibo3(numb-2);
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.Fibo(5));
        System.out.println(fibonacci.Fibo2(5));
        System.out.println(LocalTime.now());
        System.out.println(fibonacci.Fibo2(50));
        System.out.println(LocalTime.now());
    }
}
