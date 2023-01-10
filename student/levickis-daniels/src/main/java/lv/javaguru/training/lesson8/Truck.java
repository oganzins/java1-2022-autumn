package lv.javaguru.training.lesson8;

import java.util.Objects;

public class Truck extends Car {

    private int loadCapacity;


    public Truck(String color, int year, String make, String model, int loadCapacity) {
        super(color, year, make, model);
        this.loadCapacity = loadCapacity;
    }

    public int loadCapacity() {
        return loadCapacity;
    }

    public String loadCapacity (String loadCapacity) {

        return loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", year='" + getYear() + '\'' +
                ", manufacturer='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", loadCapacity=" + loadCapacity +
                "} ";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Objects.equals(loadCapacity, truck.loadCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }
















    }
