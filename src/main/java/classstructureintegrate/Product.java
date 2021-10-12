package classstructureintegrate;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int increasePrice(int numb){
        return price = price + numb;
    }

    public int decreasePrice(int numb){
        return price = price - numb;
    }
}
