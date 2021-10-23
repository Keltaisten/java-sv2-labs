package finalmodifier;

public class TaxCalculator {
    final static int TAX_CONST = 27;

    public double tax(double price){
        return 1.0*TAX_CONST/100*price;
    }

    public double priceWithTax(double price){
        return (1+TAX_CONST/100.0)*price;
    }

    public static void main(String[] args) {
    TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.tax(50));
        System.out.println(taxCalculator.priceWithTax(50));
    }
}
