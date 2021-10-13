package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Add meg a darab nevét");
        String name = scann.nextLine();
        System.out.println("Add meg a darab árát");
        int price = scann.nextInt();

        Product product = new Product(name, price);

        System.out.println("A darab neve és eredeti ára: " + name + ", " + price + "Ft");

        product.increasePrice(1000);

        System.out.println("A  ára emelkedett: " + product.getPrice() + "Ft");

        product.decreasePrice(500);

        System.out.println("A darab ára csökkent: " + product.getPrice() + "Ft");

    }

}
