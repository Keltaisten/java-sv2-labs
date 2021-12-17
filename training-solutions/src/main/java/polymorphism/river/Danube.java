package polymorphism.river;

import java.util.Arrays;
import java.util.List;

public class Danube extends River{
    private List<String> capitals;

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public static void main(String[] args) {
        Water water = new Danube("Város",200, Arrays.asList("Budapest", "Bécs"));
        River river = new Danube("Falu",300, Arrays.asList("Budapest", "Győr", "Baja"));
        Danube danube = new Danube("Metropolisz",400, Arrays.asList("Budapest", "Győr",
                "Baja", "Pozsony"));
        System.out.println(river.getName());
        System.out.println(river.getLength());
        System.out.println(danube.getCapitals());
        System.out.println(danube.getName());
        System.out.println(danube.getLength());
    }

    public List<String> getCapitals() {
        return capitals;
    }
}
