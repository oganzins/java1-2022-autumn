package lv.javaguru.training.lesson11.homework;

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
        if (isPresent(product)) {
            products.put(product.getName(), product);
        }
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
        return List.copyOf(products.values());
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
        double productPrice = 0;
        for (Product product : products.values()) {
            if (product.getName().equals(productName)) {
                productPrice = product.getPrice();
            }
        }
        return productPrice;
    }

    @Override
    public void updateProductPrice(String productName, double newPrice) {
        for (Product product : products.values()) {
            if (product.getName().equals(productName)) {
                product.setPrice(newPrice);
            }
        }

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

        Product expensiveProduct = null;
        for (Product product : products.values()) {
            if (expensiveProduct == null || expensiveProduct.getPrice() < product.getPrice()) {
                expensiveProduct = product;
            }
        }

        return expensiveProduct;
    }

    @Override
    public void removeProduct(String productName) {
        products.remove(productName);
    }

    private boolean isPresent(Product product) {
        return !products.containsKey(product.getName());
    }
}
