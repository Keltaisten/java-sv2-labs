package numbers;

public class Percent {
    public double getValue(int number, int percentOfNumber){
        return (double)number*percentOfNumber/100;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        System.out.println(percent.getValue(200,60));
    }
}
