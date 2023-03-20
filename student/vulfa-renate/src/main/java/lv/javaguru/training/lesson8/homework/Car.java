package lv.javaguru.training.lesson8.homework;

import java.util.Objects;

public class Car {
    private String color;
    private int year;
    private String make;
    private  String model;

    public Car(String color, int year, String make, String model) {
        this.color = color;
        this.year = year;
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year
                && Objects.equals(color, car.color)
                && Objects.equals(make, car.make) && Objects.equals(model, car.model);
    }


    @Override
    public int hashCode() {
        return Objects.hash(color, year, make, model);
    }
}
