package conversions;

public class TooBigNumber {
    public long getRightResult(int number){
        long longNumber = 2_147_483_647;
        longNumber += number;
        return longNumber;
    }

    public static void main(String[] args) {
        TooBigNumber tooBigNumber = new TooBigNumber();
        System.out.println(tooBigNumber.getRightResult(1111));
    }
}
