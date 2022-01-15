package collectionsequalshas;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    List<Product> products = new ArrayList<>();

    public int findHowMany(Product product) {
        int number = 0;
        for(Product actual : products){
            if(actual.equals(product)){
                number++;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        webShop.products.add(new Product("kifli", "1123"));
        webShop.products.add(new Product("kenyér", "4153"));
        webShop.products.add(new Product("fekete zsemle", "5325"));
        webShop.products.add(new Product("kék zsemle", "5325"));
        webShop.products.add(new Product("bagett", "1235"));
        System.out.println(webShop.findHowMany(new Product("barna zsemle","5325")));
    }
}
