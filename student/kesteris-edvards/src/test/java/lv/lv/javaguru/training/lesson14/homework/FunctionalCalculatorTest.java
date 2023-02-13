package lv.lv.javaguru.training.lesson14.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FunctionalCalculatorTest {

    @Test
    public void shouldSumTwoNumbers() {
        double result = FunctionalCalculator.sum().apply(10.0, 5.0);

        Assertions.assertEquals(15.0, result);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        double result = FunctionalCalculator.subtract().apply(10.0, 5.0);

        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        double result = FunctionalCalculator.multiply().apply(10.0, 5.0);

        Assertions.assertEquals(50.0, result);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        double result = FunctionalCalculator.divide().apply(10.0, 5.0);

        Assertions.assertEquals(2.0, result);
    }

    @Test
    public void shouldSquareNumber() {
        double result = FunctionalCalculator.square().apply(10.0);

        Assertions.assertEquals(100.0, result);
    }

}