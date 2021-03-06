package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {
    private List<String> authors;
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
        if(Validators.isEmpty(authors)){
            throw new IllegalArgumentException("No members in the list");
        }

        if(Validators.isLongEnough(numberOfPages)){
            throw new IllegalArgumentException("The song length must be longer than 0");
        }

        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    @Override
    public List<String> getContributors() {
        return new ArrayList<>(authors);
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
