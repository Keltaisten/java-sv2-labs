package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {
    private List<Feature> features;
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.features = Arrays.asList(features);
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int fullLengthAtOneItem() {
        int result = 0;
        for(Feature feat: features){
            if(feat instanceof AudioFeatures){
                result += ((AudioFeatures) feat).getLength();
            }
        }
        return result;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for(Feature feat: features){
            contributors.addAll(feat.getContributors());
        }
        return contributors;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for(Feature feat: features){
            titles.add(feat.getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature(){
        boolean hasAudio = false;
        for(Feature feature: features){
            if(feature instanceof AudioFeatures){
                hasAudio = true;
            }
        }
        return hasAudio;
    }

    public boolean hasPrintedFeature(){
        boolean hasPrinted = false;
        for(Feature feature: features){
            if(feature instanceof PrintedFeatures){
                hasPrinted = true;
            }
        }
        return hasPrinted;
    }

    public int numberOfPagesAtOneItem(){
        int result = 0;
        for(Feature feat: features){
            if(feat instanceof PrintedFeatures){
                result += ((PrintedFeatures) feat).getNumberOfPages();
            }
        }
        return result;
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
