package lv.javaguru.training.lesson14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalCalculator{

public static  BiFunction <Double, Double, Double> sum = (a, b) -> a + b; {
}

    public static BiFunction<Double, Double, Double> subtract = (a, b) -> a - b; {
    }

    public static BiFunction<Double, Double, Double> multiply = (a, b) -> a * b; {
    }

    public static BiFunction<Double, Double, Double> divide = (a,b) -> a / b;{
    }

    public static Function<Double, Double> square = (a) -> a* a; {
    }


    }

