package introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Melange");
        coffee.setPrice(700);
        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());
        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Habos kávé");
        cappuccino.setPrice(750);
        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());
    }
}
