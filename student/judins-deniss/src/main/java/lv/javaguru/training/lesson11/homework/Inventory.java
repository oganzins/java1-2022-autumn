package lv.javaguru.training.lesson11.homework;

import java.util.List;

public interface Inventory {

    void addProduct(Product product);

    Product getProduct(String productName);

    int getProductCount();

    List<Product> getAllProducts();

    int getProductQuantity(String productName);

    void updateProductQuantity(String productName, int newQuantity);

    double getProductPrice(String productName);

    void updateProductPrice(String productName, double newPrice);

    Product getProductWithLowestPrice();

    Product getProductWithHighestPrice();

    void removeProduct(String productName);

}
