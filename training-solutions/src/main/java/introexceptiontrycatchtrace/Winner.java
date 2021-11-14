package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Winner {
    ArrayList<String> names = new ArrayList<>(Arrays.asList("István", "Adam", null, "Kristóf", "Jane"));

    public String getWinner(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(names.size());
        return names.get(randomNumber).toUpperCase();
    }
}
