package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {
    private List<String> composer = new ArrayList<>();
    private int length;
    private List<String> performers;
    private String title;

    public AudioFeatures(String title, int length, List<String> composer, List<String> performers) {
        Validators.isBlank(title);
        Validators.isEmpty(composer);
        Validators.isEmpty(performers);
        Validators.isLongEnough(length);
        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    public AudioFeatures(String title, int length, List<String> performers) {
        Validators.isBlank(title);
        Validators.isEmpty(performers);
        Validators.isLongEnough(length);
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
