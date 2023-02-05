package lv.javaguru.training.lesson11.homework;

import lv.javaguru.training.lesson3.homework.Cat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleInventory implements Inventory {

    private Map<String, Product> products;

    public SimpleInventory() {
        products = new HashMap<>();
    }

    @Override
    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }

    @Override
    public Product getProduct(String productName) {
        return products.get(productName);
    }

    @Override
    public int getProductCount() {
        return products.size();
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> foundAllProducts = new ArrayList<>();
        return foundAllProducts;
    }

    @Override
    public int getProductQuantity(String productName) {
        int productQuantity = 0;
        for (Product product : products.values()) {
            if (product.getName().equals(productName)) {
                productQuantity = product.getQuantity();
            }
        }
        return productQuantity;
    }

    @Override
    public void updateProductQuantity(String productName, int newQuantity) {
        for (Product product : products.values()) {
            if (product.getName().equals(productName)) {
                product.setQuantity(newQuantity);
            }
        }
    }

    @Override
    public double getProductPrice(String productName) {
        return products.get(productName).getPrice();
    }

    @Override
    public void updateProductPrice(String productName, double newPrice) {
        products.get(productName).setPrice(newPrice);
    }

    @Override
    public Product getProductWithLowestPrice() {
        Product cheapestProduct = null;
        for (Product product : products.values()) {
            if (cheapestProduct == null || cheapestProduct.getPrice() > product.getPrice()) {
                cheapestProduct = product;
            }
        }
        return cheapestProduct;
    }

    @Override
    public Product getProductWithHighestPrice() {
        Product mostExpensiveProduct = null;
        for (Product product : products.values()) {
            if (mostExpensiveProduct == null || mostExpensiveProduct.getPrice() < product.getPrice()) {
                mostExpensiveProduct = product;
            }
        }
        return mostExpensiveProduct;
    }

    @Override
    public void removeProduct(String productName) {
        products.remove(productName);
    }

}
