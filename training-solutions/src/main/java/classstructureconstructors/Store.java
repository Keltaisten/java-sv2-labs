package classstructureconstructors;

public class Store {
    private String product;
    private int stock = 0;

    public Store(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void store(int stock){
        this.stock = this.stock + stock;
    }

    public void dispatch(int stock){
        this.stock = this.stock - stock;
    }
}
