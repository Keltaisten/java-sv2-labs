package collectionsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    List<ChristmasPresent> christmasPresents = new ArrayList<>();

    public ChristmasShopping(List<ChristmasPresent> christmasPresents) {
        this.christmasPresents = christmasPresents;
    }

    public void addNewPresent(ChristmasPresent present) {
        christmasPresents.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        Iterator<ChristmasPresent> it = christmasPresents.iterator();
        while (it.hasNext()) {
            ChristmasPresent present = it.next();
            if(present.getPrice() > maxPrice){
                it.remove();
            }
        }
    }

    public List<ChristmasPresent> getChristmasPresents() {
        return christmasPresents;
    }
}
