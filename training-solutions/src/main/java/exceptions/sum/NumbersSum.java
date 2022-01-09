package exceptions.sum;

public class NumbersSum {
    public int getSum(int[] numbers) {
        int sum = 0;
        try {
            for (int number : numbers) {
                sum += number;
            }
        }
        catch (NullPointerException npe){
            throw new IllegalArgumentException("The array cannot be empty!");
        }
        return sum;
    }

    public int getSum(String[] numbers) {
        int sum = 0;
        try {
            for(String word: numbers){
                int number = Integer.parseInt(word);
                sum += number;
            }
        }
        catch (NullPointerException npe){
            throw new IllegalArgumentException("The array cannot be empty!", npe);
        }
        catch (NumberFormatException nfe){
            throw new IllegalArgumentException("Not only numbers in the list!", nfe);
        }
        return sum;
    }
}
