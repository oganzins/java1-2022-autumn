package lv.javaguru.training.lesson13.shop;

import java.util.List;

public interface ShoppingCart {

    void add(Product product);

    void add(String name, double price);

    void removeProduct(Product product);

    void removeProduct(String name);

    List<Product> getProducts();

    double getTotal();

}
