package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem billItem = new BillItem("TV",90_000,2,27);
        System.out.println("A " + billItem.getProduct() + " ára: " + billItem.calculateTotalPrice() + "Ft");
    }
}
