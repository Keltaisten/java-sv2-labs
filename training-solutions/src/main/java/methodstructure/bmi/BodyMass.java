package methodstructure.bmi;

public class BodyMass {
    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getBodyMassIndex(){
        return (weight/(height*height));
    }

    public BmiCategory getBody(){
        String body;
        if(getBodyMassIndex() < 18.5){
            body = String.valueOf(BmiCategory.UNDERWEIGHT);
        }
        else if(getBodyMassIndex() > 25){
            body = String.valueOf(BmiCategory.OVERWEIGHT);
        }
        else{
            body = String.valueOf(BmiCategory.NORMAL);
        }
            return BmiCategory.valueOf(body);
    }

    public boolean isThinnerThan(BodyMass other){
        return this.getBodyMassIndex() < other.getBodyMassIndex();
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
