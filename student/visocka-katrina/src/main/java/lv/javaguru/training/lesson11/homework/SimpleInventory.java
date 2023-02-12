package lv.javaguru.training.lesson11.homework;

import java.util.*;

public class SimpleInventory implements Inventory {
    private Map<String, Product> products;

    public SimpleInventory() {
        products = new HashMap<>();
    }

    @Override
    public void addProduct(Product product) {
        this.products.put(product.getName(), product);
    }

    @Override
    public Product getProduct(String productName) {
        return this.products.get(productName);
    }

    @Override
    public int getProductCount() {
        return this.products.size();
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> returnProducts = new ArrayList<>();
        for (Product product : products.values()) {
            returnProducts.add(product);
        }

        return returnProducts;
    }

    @Override
    public int getProductQuantity(String productName) {
        Product product = this.products.get(productName);
        return product.getQuantity();
    }

    @Override
    public void updateProductQuantity(String productName, int newQuantity) {
        Product product = this.products.get(productName);
        product.setQuantity(newQuantity);
        this.products.put(productName, product);
    }

    @Override
    public double getProductPrice(String productName) {
        Product product = this.products.get(productName);
        return product.getPrice();
    }

    @Override
    public void updateProductPrice(String productName, double newPrice) {
        Product product = this.products.get(productName);
        product.setPrice(newPrice);
        this.products.put(productName, product);
    }

    @Override
    public Product getProductWithLowestPrice() {
        Product productToReturn = null;
        for (Product product : products.values()) {
            if (productToReturn == null || product.getPrice() < productToReturn.getPrice()) {
                productToReturn = product;
            }
        }
        return productToReturn;
    }

    @Override
    public Product getProductWithHighestPrice() {
        Product productToReturn = null;
        for (Product product : products.values()) {
            if (productToReturn == null || product.getPrice() > productToReturn.getPrice()) {
                productToReturn = product;
            }
        }
        return productToReturn;
    }

    @Override
    public void removeProduct(String productName) {
        products.remove(productName);
    }
}
