package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();
        System.out.println(operators.binary(1001));
        System.out.println(operators.isEven(15));
        System.out.println(operators.getResultOfDivision(22,4));
        System.out.println(operators.isNull("Rövid szöveg"));
        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty("Másik szöveg"));

        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirections());
    }
}
