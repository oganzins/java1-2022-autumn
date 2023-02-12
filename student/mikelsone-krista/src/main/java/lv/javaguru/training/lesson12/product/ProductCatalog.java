package lv.javaguru.training.lesson12.product;

import java.util.Collection;

public interface ProductCatalog {
    void addProduct(Product product) throws ValidationException, DuplicateProductException;

    Collection<Product> getAllProducts();

    Product findByName(String name) throws ProductNotFoundException;

    void removeByName(String name) throws ProductNotFoundException;

}
