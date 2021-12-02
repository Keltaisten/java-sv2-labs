package constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {
    private String shortDescription;
    private int price;
    private List<String> extras;
    private String brand;
    private String serialNumber;

    public BikeAdvertisement(String shortDescription, int price) {
        this.shortDescription = shortDescription;
        this.price = price;
    }

    public BikeAdvertisement(String shortDescription, int price, String brand) {
        this.shortDescription = shortDescription;
        this.price = price;
        this.brand = brand;
    }

    public BikeAdvertisement(String shortDescription, int price, String brand, List<String> extras) {
        this.shortDescription = shortDescription;
        this.price = price;
        this.extras = extras;
        this.brand = brand;
    }

    public BikeAdvertisement(String shortDescription, int price, String brand, List<String> extras, String serialNumber) {
        this.shortDescription = shortDescription;
        this.price = price;
        this.extras = extras;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getExtras() {
        return extras;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
