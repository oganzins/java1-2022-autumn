package lv.javaguru.training.lesson12.homework;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

public class SimpleProductCatalog implements ProductCatalog {
    private Map<String, Product> products;

    public SimpleProductCatalog() {products = new HashMap<>();}

    @Override
    public void addProduct(Product product) throws ValidationException, DuplicateProductException {


        if (product.getName() == null || product.getName().equals("")) {
            throw new ValidationException("Enter product name!"); } else if (product.getName().length() > 50) {
            throw new ValidationException("Name is too long, max 50 symbols!");
        }
        if (product.getDescription() == null || product.getDescription().equals("")) {
            throw new ValidationException("Add product description!");
        } else if (product.getDescription().length() > 100) {
            throw new ValidationException("Description is too long, max 100 symbols!");
        }
        if (products.containsKey(product.getName())) {
            throw new DuplicateProductException("Product already exist!");
        }
        if (product.getPrice() == 0 || product.getPrice() < 0) {
            throw new ValidationException("Product price must be greater than 0!");

        }
        if (adding(product)) {
            products.put(product.getName(),product);
        }

    }

    private boolean adding(Product product) {
        return !products.containsKey(product.getName());
    }

    @Override
    public Collection<Product> getAllProducts() {
        return products.values();
    }

    @Override
    public Product findByName(String name) throws ProductNotFoundException {

        Product productFound = null;
        for (Product product : products.values()) {
            if (product.getName().equals(name)) {
                productFound = product;
            } else {
                throw new ProductNotFoundException("Product not found.");
            }
        }

        return productFound;
    }

    @Override
    public void removeByName(String name) throws ProductNotFoundException {

        for (Product product : products.values()) {
            if (product.getName().equals(name)) {
                products.remove(name);
            } else { throw new ProductNotFoundException("Product not found.");}
        }

    }

}
