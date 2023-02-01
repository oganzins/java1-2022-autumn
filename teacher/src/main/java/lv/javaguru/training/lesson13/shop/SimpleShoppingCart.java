package lv.javaguru.training.lesson13.shop;

import java.util.ArrayList;
import java.util.List;

public class SimpleShoppingCart implements ShoppingCart {

    private List<Product> products;

    public SimpleShoppingCart() {
        products = new ArrayList<>();
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void add(String name, double price) {
        Product product = new Product(name, price);
        add(product);
    }

    @Override
    public void removeProduct(Product product) {
        while (products.remove(product)) ;
    }

    @Override
    public void removeProduct(String name) {
        List<Product> removableProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equals(name)) {
                removableProducts.add(product);
            }
        }
        products.removeAll(removableProducts);
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public double getTotal() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

}
