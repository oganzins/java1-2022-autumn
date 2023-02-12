package lv.javaguru.training.lesson14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ShapeArea {

    public static Function<Double, Double> squareArea = (side) -> side*side; {

    }

    public static BiFunction<Double, Double, Double> rectangleArea = (height, width) -> width*height; {
    }

    public static Function<Double, Double> circleArea = (radius) -> radius*radius* 3.14; {
    }

    public static BiFunction<Double, Double, Double> triangleArea = (height, side) -> height*side/2; {

    }










}
