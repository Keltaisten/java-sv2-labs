package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl control = new IntroControl();

        System.out.println("-subtractTenIfGreaterThanTen");
        System.out.println(control.subtractTenIfGreaterThanTen(9));
        System.out.println(control.subtractTenIfGreaterThanTen(15));
        System.out.println("-describeNumber");
        System.out.println(control.describeNumber(0));
        System.out.println(control.describeNumber(5));
        System.out.println("-greetingToJoe");
        System.out.println(control.greetingToJoe("Joe"));
        System.out.println(control.greetingToJoe("Jane"));
        System.out.println("-calculateBonus");
        System.out.println(control.calculateBonus(900_000));
        System.out.println(control.calculateBonus(1_250_000));
        System.out.println("-calculateComsumption");
        System.out.println(control.calculateComsumption(9998,2));
        System.out.println(control.calculateComsumption(100,200));
        System.out.println(control.calculateComsumption(9998,4));
        System.out.println("-printNumbers");
        control.printNumbers(6);
        System.out.println("-printNumbersBetween");
        control.printNumbersBetween(20,25);
        System.out.println("-printNumbersBetweenAnyDirection");
        control.printNumbersBetweenAnyDirection(15,18);
        System.out.println("-printNumbersBetweenAnyDirection");
        control.printNumbersBetweenAnyDirection(16,12);
        System.out.println("-printOddNumbers");
        control.printOddNumbers(16);
        //control.printOddNumbers2(14);
    }
}
