package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    public List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int page) {
        if (page <= 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        double allPages = 0;
        int numberOfPrintedItems = 0;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                for (Feature feature : catalogItem.getFeatures()) {
                    if (feature instanceof PrintedFeatures && ((PrintedFeatures) feature).getNumberOfPages() > page) {
                        allPages += ((PrintedFeatures) feature).getNumberOfPages();
                        numberOfPrintedItems++;
                    }
                }
            }
        }
        if (numberOfPrintedItems == 0) {
            throw new IllegalArgumentException("No page");
        }
        return allPages / numberOfPrintedItems;
    }

    public void deleteItemByRegistrationNumber(String regItem) {
        List<CatalogItem> deletableItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(regItem)) {
                deletableItems.add(catalogItem);
            }
        }
        catalogItems.removeAll(deletableItems);
    }

    public int getAllPageNumber() {
        int pages = 0;
        for (CatalogItem catalogItem : catalogItems) {
            pages += catalogItem.numberOfPagesAtOneItem();
        }
        return pages;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                audioItems.add(catalogItem);
            }
        }
        return audioItems;
    }

    public int getFullLength() {
        int result = 0;
        for (CatalogItem catalogItem : catalogItems) {
            result += catalogItem.fullLengthAtOneItem();
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>();
        for(CatalogItem catalogItem: catalogItems){
                for(Feature feature: catalogItem.getFeatures()){
                    if(searchCriteria.hasTitle() && feature.getTitle().equals(searchCriteria.getTitle())){
                        result.add(catalogItem);
                    }
                    else if(searchCriteria.hasContributor()){
                        for(String s: feature.getContributors()){
                            if(s.equals(searchCriteria.getContributor())){
                                result.add(catalogItem);
                            }
                        }
                    }
                }
        }

        return result;
    }
}
