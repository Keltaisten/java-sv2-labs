package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        Fruit fruit = new Fruit();
        objects.add(fruit);
        Apple apple = new Apple();
        objects.add(apple);
        Starking starking = new Starking();
        objects.add(starking);
        Vegetable vegetable = new Vegetable();
        objects.add(vegetable);
        objects.add("alma");
        objects.add(12);
        objects.add('x');
        LocalDate localDate = LocalDate.now();
        objects.add(localDate);
        int[] integerArray = new int[3];
        integerArray[0] = 44;
        integerArray[1]= 33;
        integerArray[2]= 22;
        objects.add(integerArray);
        List<String> stringList = new ArrayList<>(Arrays.asList("alma", "körte", "cipó"));
        objects.add(stringList);
        System.out.println(objects);
    }
}
