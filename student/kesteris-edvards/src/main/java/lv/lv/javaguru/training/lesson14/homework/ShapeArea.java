package lv.lv.javaguru.training.lesson14.homework;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ShapeArea {

    public static Function<Double, Double> squareArea() {
        Function<Double, Double> result = (side) -> side * side;
        return result;
    }

    public static BiFunction<Double, Double, Double> rectangleArea() {
        BiFunction<Double, Double, Double> result = (height, width) -> height * width;
        return result;
    }

    public static Function<Double, Double> circleArea() {
        Function<Double, Double> result = (redius) -> redius * redius * 3.14;
        return result;
    }

    public static BiFunction<Double, Double, Double> triangleArea() {
        BiFunction<Double, Double, Double> result = (height, side) -> height * side / 2;
        return result;
    }
}
