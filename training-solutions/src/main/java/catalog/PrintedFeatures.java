package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {
    private List<String> authors;
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        Validators.isEmpty(authors);
        Validators.isLongEnough(numberOfPages);
        Validators.isBlank(title);
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
