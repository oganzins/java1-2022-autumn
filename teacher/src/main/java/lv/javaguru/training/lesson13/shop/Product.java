package lv.javaguru.training.lesson13.shop;

import java.util.Objects;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        String nonNullName = Objects.requireNonNull(name);
        if (!nonNullName.isEmpty()) {
            this.name = name;
            this.price = price;
        } else {
            throw new ProductNameCannotBeEmpty();
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
