package lv.javaguru.training.lesson12.product;

import java.util.Objects;

public class Product {

    private String Name;
    private String Description;
    private double Price;

    public Product(String s, String s1, double v) {
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public double getPrice() {
        return Price;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.Price, Price) == 0 && Objects.equals(Name, product.Name) && Objects.equals(Description, product.Description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Description, Price);
    }
}
