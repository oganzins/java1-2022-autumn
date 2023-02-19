package lv.javaguru.training.homework12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SimpleProductCatalog implements ProductCatalog {

    private Map<String, Product> products;

    public SimpleProductCatalog() {
        products = new HashMap<>();
    }


    @Override
    public void addProduct(Product product) throws ValidationException, DuplicateProductException {

        AllExceptions(product);
        if (isPresent(product)) {
            products.put(product.getName(), product);
        }
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
                throw new ProductNotFoundException("Product not found!");
            }
        }
        return productFound;
    }

    @Override
    public void removeByName(String name) throws ProductNotFoundException {
        for (Product product : products.values()) {
            if (product.getName().equals(name)) {
                products.remove(name);
            } else {
                throw new ProductNotFoundException("Product not found!");
            }
        }
    }

    private boolean isPresent(Product product) {
        return !products.containsKey(product.getName());
    }

    private void AllExceptions(Product product) throws ValidationException, DuplicateProductException {
        if (product.getName() == null || product.getName().equals("")) {
            throw new ValidationException("Enter product name!");
        } else if (product.getName().length() > 50) {
            throw new ValidationException("Name is too long! 50 symbols max!");
        }
        if (product.getDescription() == null || product.getDescription().equals("")) {
            throw new ValidationException("Add product description!");
        } else if (product.getDescription().length() > 100) {
            throw new ValidationException("Description is too long! 100 symbols max!");
        }
        if (products.containsKey(product.getName())) {
            throw new DuplicateProductException("Product is already added!");
        }
        if (product.getPrice() == 0 || product.getPrice() < 0) {
            throw new ValidationException("Enter product price.Price should be greater than 0!");
        }
    }
}
