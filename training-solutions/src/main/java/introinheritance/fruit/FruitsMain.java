package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("Narancs");
        fruit.setWeight(100);

        Grape grape = new Grape();
        grape.setName("Rizling");
        grape.setWeight(150);
        grape.setType("Fehér");

        Apple apple = new Apple();
        apple.setName("Green");
        apple.setWeight(300);
        apple.setPieces(5);

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("Finom");
        goldenDelicious.setWeight(350);
        goldenDelicious.setPieces(10);

        Starking stark = new Starking();
        stark.setName("Fincsi");
        stark.setWeight(400);
        stark.setPieces(12);


        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());

        System.out.println(grape.getName());
        System.out.println(grape.getWeight());
        System.out.println(grape.getType());

        System.out.println(apple.getName());
        System.out.println(apple.getWeight());
        System.out.println(apple.getPieces());

        System.out.println(goldenDelicious.getName());
        System.out.println(goldenDelicious.getWeight());
        System.out.println(goldenDelicious.getPieces());
        System.out.println(goldenDelicious.getColour());

        System.out.println(stark.getName());
        System.out.println(stark.getWeight());
        System.out.println(stark.getPieces());
        System.out.println(stark.getColour());
    }
}
