package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {
    List<String> bunch = new LinkedList<>();

    public void addFlower(String flower){
        bunch.add(flower);
    }

    public List<String> getBunch() {
        return bunch;
    }

    public void addFlowerInTheMiddle(String flower) {
        if(bunch.size() % 2 == 0){
            bunch.add(bunch.size() / 2,flower);
        }
        else {
            bunch.add(bunch.size() / 2 + 1,flower);
            bunch.add(bunch.size() / 2 - 1, flower);
        }
    }
}
