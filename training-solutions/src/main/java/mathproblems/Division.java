package mathproblems;

import java.util.ArrayList;
import java.util.List;

public class Division {
    public void getDivisors(int number){
        List<String> divirors = new ArrayList<>();
        int steps = 1;
        divirors.add(0,(""));
        for(int i = 1; i <= number/i; i++){
            if(number%i == 0){
                divirors.add((steps-1),("" + number + " osztója: " + i));
                if(number/i != i){
                    divirors.add(steps, ("" + number + " osztója: " + number / i));
                    steps++;
                }
            }
        }
        for(String elements:divirors){
            System.out.println(elements);
        }
    }

    public static void main(String[] args) {
        Division division = new Division();
        division.getDivisors(2310);
        int[] array = {1, 5, 6, 7, 8, 4};
        division.getRightNumbers(array);
    }

    public void getRightNumbers(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            if(i != 0 && numbers[i]%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
