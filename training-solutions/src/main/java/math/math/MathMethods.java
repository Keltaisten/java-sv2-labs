package math.math;

public class MathMethods {
    public static void main(String[] args) {
        int biggerNumber = Math.max(10,15);
        System.out.println(biggerNumber);

        int smallerNumber = Math.min(8,12);
        System.out.println(smallerNumber);

        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));

        System.out.println(Math.round(5.78));

        System.out.println(Math.abs(-9.6));

        System.out.println(Math.negateExact(3));

        System.out.println(Math.addExact(62,54));

        System.out.println(Math.subtractExact(82,96));

        System.out.println(Math.multiplyExact(5,6));

        System.out.println(Math.pow(1.2,2.5));

        System.out.println(Math.incrementExact(5));

        System.out.println(Math.decrementExact(4));

        System.out.println(Math.random());

    }
}
