package finalmodifier;

public class CylinderCalculator {
    public double calculateVolume(double r, double h){
        return r*r*CircleCalculator.PI*h;
    }
    public double calculateArea(double r, double h){
        return 2*r*CircleCalculator.PI*h + 2*r*r*CircleCalculator.PI;
    }
}
