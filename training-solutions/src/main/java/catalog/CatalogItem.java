package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {
    private List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.features = Arrays.asList(features);
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int fullLengthAtOneItem() {
        return 1;
    }

    public List<String> getContributors() {

    }

    public List<String> getTitles() {

    }

    public boolean hasAudioFeature(){

    }

    public boolean hasPrintedFeature(){

    }

    public int numberOfPagesAtOneItem(){
        
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
