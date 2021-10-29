package mathproblems;

public class Division {
    public void getDivisors(int number){
//        int numberCopy = number;
        for(int i = 1; i<= number/2;i++){
            if(number%i == 0){
                System.out.println(number + " osztója: " + i);
            }
        }
        System.out.println(number + " osztója: " + number);
    }

    public static void main(String[] args) {
        Division division = new Division();
        division.getDivisors(100);
    }
}
