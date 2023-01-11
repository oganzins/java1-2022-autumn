package lv.javaguru.training.lesson3.homework;

public class Drink {
    String type;
    boolean isHot;
    double price;

    public String getType() {
        return type;
    }

    public boolean getIsHot() {
        return isHot;
    }

    public double getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsHot(boolean isHot) {
        this.isHot = isHot;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Drink: " + type +
                ", Drink is hot: " + isHot +
                ", Price: " + price + " EUR");

    }
}

