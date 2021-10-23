package finalmodifier;

public class PiMain {

    public static void main(String[] args) {
    CircleCalculator circleCalculator = new CircleCalculator();
    CylinderCalculator cylinderCalculator = new CylinderCalculator();
    CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();
        System.out.println(circleCalculator.calculatePerimeter(5));
        System.out.println(circleCalculator.calculateArea(5));
        System.out.println(cylinderCalculator.calculateArea(5,12));
        System.out.println(cylinderCalculator.calculateVolume(5,12));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateArea(5,12));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateVolume(5,12));
        System.out.println("Pi értéke: " + CircleCalculator.PI);
    }
}
