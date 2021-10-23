package finalmodifier;

public class CircleCalculator {
    final static double PI = 3.141592;

    public double calculatePerimeter(double r){
        return 2*r*PI;
    }

    public double calculateArea(double r){
        return r*r*PI;
    }
}
