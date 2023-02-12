package lv.javaguru.training.lesson12.product;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message) {
        super(message);
    }
}
