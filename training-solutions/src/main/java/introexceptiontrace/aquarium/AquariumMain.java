package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Fish fish = new Fish("nagy", "piros");
        Fish fish2 = new Fish("kicsi", "sárga");
        Fish fish3 = new Fish("közepes", "zöld");
        aquarium.addFish(fish);
        aquarium.addFish(fish2);
        aquarium.addFish(fish3);
        System.out.println(aquarium.getNumberOfFish());
    }
}
