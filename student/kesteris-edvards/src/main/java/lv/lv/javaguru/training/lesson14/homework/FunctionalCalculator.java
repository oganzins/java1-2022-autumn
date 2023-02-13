package lv.lv.javaguru.training.lesson14.homework;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalCalculator {
    public static BiFunction<Double, Double, Double> sum() {
        BiFunction<Double, Double, Double> result = ((a, b) -> a + b);
        return result;
    }

    public static BiFunction<Double, Double, Double> subtract() {
        BiFunction<Double, Double, Double> result = ((a, b) -> a - b);
        return result;
    }

    public static BiFunction<Double, Double, Double> multiply() {
        BiFunction<Double, Double, Double> result = ((a, b) -> a * b);
        return result;
    }

    public static BiFunction<Double, Double, Double> divide() {
        BiFunction<Double, Double, Double> result = ((a, b) -> a / b);
        return result;
    }

    public static Function<Double, Double> square() {
        Function<Double, Double> result = (a) -> a * a;
        return result;
    }
}
