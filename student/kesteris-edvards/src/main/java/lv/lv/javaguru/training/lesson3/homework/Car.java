package lv.lv.javaguru.training.lesson3.homework;

/*
    Homework accepted
 */
public class Car {
    public String name;
    public String model;
    public String type;
    public String color;
    int wheels;

    public void printInfo() {
        System.out.println("Car name: " + name);
        System.out.println("Car model: " + model);
        System.out.println("Car type: " + type);
        System.out.println("Car color: " + color);
        System.out.println("Car wheels: " + wheels);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }


}
