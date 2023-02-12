package lv.javaguru.training.lesson11;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int quanity;

    public Product(String s, double v, int i) {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && quanity == product.quanity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quanity);
    }
}
