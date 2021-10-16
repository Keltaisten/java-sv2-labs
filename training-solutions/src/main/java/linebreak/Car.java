package linebreak;

public class Car {
    //Nem engedte a static nélkül lefuttatni. Miért lehet ez?
    public static String getBrandAndTypeInSeparateLines(String brand, String type){
        return "Márka: " + brand + System.lineSeparator() + "Típus: " + type;
    }

    public static void main(String[] args) {
        System.out.println(getBrandAndTypeInSeparateLines("Toyota", "Corolla"));
    }
}
