package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {
    private List<String> composer = new ArrayList<>();
    private int length;
    private List<String> performers;
    private String title;

    public AudioFeatures(String title, int length, List<String> composer, List<String> performers) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
        if(Validators.isEmpty(composer) || Validators.isEmpty(performers)){
            throw new IllegalArgumentException("No members in the list");
        }

        if(Validators.isLongEnough(length)){
            throw new IllegalArgumentException("The song length must be longer than 0");
        }

        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    public AudioFeatures(String title, int length, List<String> performers) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
        if(Validators.isEmpty(performers)){
            throw new IllegalArgumentException("No members in the list");
        }

        if(Validators.isLongEnough(length)){
            throw new IllegalArgumentException("The song length must be longer than 0");
        }

        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    @Override
    public List<String> getContributors() {
        List<String> result = new ArrayList<>(performers);
        result.addAll(new ArrayList<>(composer));
        return result;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
