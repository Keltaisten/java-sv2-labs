package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeNursery {
    List<Sapling> saplings = new ArrayList<>();

    public TreeNursery(List<Sapling> saplings) {
        this.saplings = saplings;
    }

    public void prune(int maxHeight) {
        saplings.forEach(sap -> sap.cut(maxHeight));
//        saplings.forEach((Sapling sapling) -> {sapling.cut(maxHeight);});
    }


    public static void main(String[] args) {
        List<String> names = Arrays.asList("John Doe", "Jack Doe", "Jane Doe");
        names.forEach((String name) -> {
            System.out.println(name);
        });
    }

    public void sell(String species, int minHeight) {
        saplings.removeIf(sapling -> sapling.getSpecies().equals(species) && sapling.getHeight() > minHeight );
    }

    public List<Sapling> getSaplings() {
        return saplings;
    }
}
