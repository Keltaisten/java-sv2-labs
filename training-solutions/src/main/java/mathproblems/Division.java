package mathproblems;

import java.util.ArrayList;
import java.util.List;

public class Division {
    public void getDivisors(int number){
        List<String> divirors = new ArrayList<>();
        int numberCopy = number;
        int steps = 1;
        divirors.add(0,(""));
//        divirors.add(1,("" + number + " osztója: " + number));
        for(int i = 1; i<= numberCopy/i;i++){
            if(number%i == 0){
                divirors.add((steps-1),("" + number + " osztója: " + i));
//                System.out.println(number + " osztója: " + i);
                if(numberCopy/i != i)
                    divirors.add(steps,("" + number + " osztója: " + numberCopy/i));
//                System.out.println(number + " osztója: " + (numberCopy/i));
                steps++;
            }
        }
        System.out.println(divirors);
//        System.out.println(number + " osztója: " + number);
        System.out.println(steps);
    }

    public static void main(String[] args) {
        Division division = new Division();
        division.getDivisors(100);
    }
}
