package mathproblems;

public class Division {
    public void getDivisors(int number){
        int numberCopy = number;
        int steps = 0;
        for(int i = 1; i<= numberCopy/i;i++){
            if(number%i == 0){
                System.out.println(number + " osztója: " + i);
                if(numberCopy/i != i)
                System.out.println(number + " osztója: " + (numberCopy/i));
                steps++;
            }
        }
//        System.out.println(number + " osztója: " + number);
        System.out.println(steps);
    }

    public static void main(String[] args) {
        Division division = new Division();
        division.getDivisors(100);
    }
}
