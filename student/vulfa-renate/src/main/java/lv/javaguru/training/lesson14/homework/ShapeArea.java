package lv.javaguru.training.lesson14.homework;


import java.util.function.BiFunction;
import java.util.function.Function;

public class ShapeArea {
    public static Function<Double, Double> squareArea() {
        Function<Double, Double> squareResult = (a) -> a * a;
        return squareResult;
    }

    public static BiFunction<Double, Double, Double> rectangleArea() {
        BiFunction<Double, Double, Double> rectangleResult = (a, b) -> a * b;
        return rectangleResult;
    }

    public static Function<Double, Double> circleArea() {
        Function<Double, Double> circleResult = (a) -> a * a * 3.14;

        return circleResult;
    }

    public static BiFunction<Double, Double, Double> triangleArea() {
        BiFunction<Double, Double, Double> triangleResult = (a, b) -> a * b / 2;
        return triangleResult;
    }

}
