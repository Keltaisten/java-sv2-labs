package introexceptiontrace.random;

import java.util.Arrays;

public class Change {
    public int[] changeNumbers(){
//        RandomOperations randomOperations = new RandomOperations();
////        int[] newNumbers = new int[randomOperations.getNumbers().length];
//        int[] newNumbers = new int[10];
//        System.out.println(randomOperations.getNumbers().length);
//        System.out.println(Arrays.toString(randomOperations.getNumbers()));
//        System.out.println(randomOperations.getNumbers().length);
//        System.out.println(Arrays.toString(randomOperations.getNumbers()));
//        System.out.println(randomOperations.getNumbers().length);
//        System.out.println(Arrays.toString(randomOperations.getNumbers()));
//        for(int i = 1; i < randomOperations.getNumbers().length;i++){
//            if((i + 1) == randomOperations.getNumbers().length){
//                System.out.println(Arrays.toString(randomOperations.getNumbers()));
//                newNumbers[i] = randomOperations.getNumbers()[i];
//            }else{
//                newNumbers[i-1] = randomOperations.getNumbers()[i];
//                System.out.println(Arrays.toString(randomOperations.getNumbers()));
//            }
//
//        }
//        return newNumbers;

            int[] numbers = new RandomOperations().getNumbers();
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            return numbers;
        }
    }

