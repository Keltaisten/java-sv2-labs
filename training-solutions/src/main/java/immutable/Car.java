package immutable;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String type;
    private final int yearOfProduction;

    public Car(String brand, String type, int yearOfProduction) {
        if(isInputBrandDataOk(brand)){
            this.brand = brand;
        }
        else{
            throw new IllegalArgumentException("Brand name is NOK");
        }

        this.type = type;

        if(isInputYearDataOk(yearOfProduction)){
            this.yearOfProduction = yearOfProduction;
        }
        else{
            throw new IllegalArgumentException("YearOfProduction name is NOK");
        }
    }

    private boolean isInputBrandDataOk(String brand) {
        if(brand == null || brand.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }

    private boolean isInputYearDataOk(int yearOfProduction) {
        if(yearOfProduction >= LocalDate.now().getYear()){
            return false;
        }
        else {
            return true;
        }
    }


}
