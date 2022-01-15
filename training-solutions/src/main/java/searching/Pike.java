package searching;

public class Pike implements Comparable<Pike> {
    private String nameOfPike;
    private int height;

    public Pike(String nameOfPike, int height) {
        this.nameOfPike = nameOfPike;
        this.height = height;
    }

    public String getNameOfPike() {
        return nameOfPike;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(Pike o) {
        return this.getNameOfPike().compareTo(o.getNameOfPike());
    }
}
