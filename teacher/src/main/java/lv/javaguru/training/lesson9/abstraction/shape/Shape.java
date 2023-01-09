package lv.javaguru.training.lesson9.abstraction.shape;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculatePerimeter();

    public String getName() {
        return name;
    }

}
