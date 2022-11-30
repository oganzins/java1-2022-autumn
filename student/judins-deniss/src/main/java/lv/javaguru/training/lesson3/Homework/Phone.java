package lv.javaguru.training.lesson3.Homework;

public class Phone {
    String maker;
    String model;

    String color;
    int year;
    int ram;
    int memorie;
    float price;

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getRam() {
        return ram;
    }

    public int getMemorie() {
        return memorie;
    }

    public float getPrice() {
        return price;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setMemorie(int memorie) {
        this.memorie = memorie;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void printinfo() {
        System.out.println("Phone maker: " + maker);
        System.out.println("Phone model: " + model);
        System.out.println("Phone color: " + color);
        System.out.println("Year of production: " + year);
        System.out.println("Amount of RAM memorie: " + ram + " GB");
        System.out.println("Phone internal memorie: " + memorie + " GB");
        System.out.println("Phone average market price: " + price + " EUR");
    }
}
