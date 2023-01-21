package lv.javaguru.training.lesson11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SimpleInventory implements Inventory{



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
    public Collection<Product> getAllProducts() {
        return products.values();

    }

    @Override
    public int getProductQuantity(String productName) {
        return products.get(productName).getQuantity();
    }

    @Override
    public void updateProductQuantity(String productName, int newQuantity) {
        products.get(productName).setQuantity(newQuantity);
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
        Product lowestPrice = null;
        for (Product product : products.values()) {
            if (lowestPrice == null || lowestPrice.getPrice() > product.getPrice()) {
                lowestPrice = product;
            }
        }

        return lowestPrice;
    }

    @Override
    public Product getProductWithHighestPrice() {
        Product highestPrice = null;
        for (Product product : products.values()) {
            if (highestPrice == null || highestPrice.getPrice() < product.getPrice()) {
                highestPrice = product;
            }
        }

        return highestPrice;
    }

    @Override
    public void removeProduct(String productName) {
        products.remove(productName);
    }
    }

