package lv.javaguru.training.lesson3.homework;

public class Perfume {

    String name;
    String brand;

    String country;

    double price;

    Perfume(String name, String brand, String country, double price) {
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.price = price;

    }

    public Perfume() {

    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getCountry() {
        return country;
    }

    void setCountry(String country) {
        this.country = country;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Perfume name: " + name);
        System.out.println("Perfumes brand: " + brand);
        System.out.println("Perfumes country: " + country);
        System.out.println("Perfumes price: " + price + " eiro ");
    }


}



