package lv.javaguru.training.lesson14;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class ShapeAreaTest {


    private AssertJUnit Assertions;

    @Test
    public void shouldCalculateSquareArea() {
        double result = ShapeArea.squareArea.apply(10.0);

        Assertions.assertEquals(100.0, result);
    }

    @Test
    public void shouldCalculateRectangleArea() {
        double result = ShapeArea.rectangleArea.apply(10.0, 5.0);

        Assertions.assertEquals(50.0, result);
    }

    @Test
    public void shouldCalculateCircleArea() {
        double result = ShapeArea.circleArea.apply(10.0);

        Assertions.assertEquals(314.0, result);
    }

    @Test
    public void shouldCalculateTriangleArea() {
        double result = ShapeArea.triangleArea.apply(10.0, 5.0);

        Assertions.assertEquals(25.0, result);
    }











}
