package catalog;

public class SearchCriteria {
    private String contributor;
    private String title;

    public SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
        if(Validators.isBlank(contributor)){
            throw new IllegalArgumentException("Empty contributor");
        }

        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByContributor(String contributor) {
        if(Validators.isBlank(contributor)){
            throw new IllegalArgumentException("Empty contributor");
        }

        return new SearchCriteria(contributor, null);
    }

    public static SearchCriteria createByTitle(String title) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }

        return new SearchCriteria(null, title);
    }

    public boolean hasContributor() {
        return contributor != null;
    }

    public boolean hasTitle() {
        return title != null;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

}
