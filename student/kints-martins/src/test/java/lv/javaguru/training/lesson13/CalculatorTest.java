package lv.javaguru.training.lesson13;

import lv.javaguru.training.lesson13.homework.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldSumTwoPositiveNumbers() {
        int result = calculator.sum(7, 6);
        Assertions.assertEquals(13, result);
    }

    @Test
    void ShouldSumOneNegativeOnePositiveNumber() {
        int result = calculator.sum(-4, 6);
        Assertions.assertEquals(2, result);
    }

    @Test
    void ShouldSumTwoNegativeNumbers() {
        int result = calculator.sum(-4, -6);
        Assertions.assertEquals(-10, result);
    }

    @Test
    void ShouldSumZeroAndPositiveNumber() {
        int result = calculator.sum(0, 6);
        Assertions.assertEquals(6, result);
    }

    @Test
    void ShouldSumZeroAndNegativeNumber() {
        int result = calculator.sum(0, -6);
        Assertions.assertEquals(-6, result);
    }

    @Test
    void ShouldSumPositiveNumberAndZero() {
        int result = calculator.sum(5, 0);
        Assertions.assertEquals(5, result);
    }

    @Test
    void ShouldSumNegativeNumberAndZero() {
        int result = calculator.sum(-5, 0);
        Assertions.assertEquals(-5, result);
    }

    @Test
    void ShouldSumTwoZeros() {
        int result = calculator.sum(0, 0);
        Assertions.assertEquals(0, result);
    }

    //Subtraction Subtraction Subtraction Subtraction Subtraction Subtraction

    @Test
    void ShouldSubtractTwoPositiveNumbers() {
        int result = calculator.subtract(10, 9);
        Assertions.assertEquals(1, result);
    }

    @Test
    void ShouldSubtractOneNegativeOnePositiveNumber() {
        int result = calculator.subtract(-10, 9);
        Assertions.assertEquals(-19, result);
    }

    @Test
    void ShouldSubtractTwoNegativeNumbers() {
        int result = calculator.subtract(-10, -9);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void ShouldSubtractZeroAndPositiveNumber() {
        int result = calculator.subtract(0, 9);
        Assertions.assertEquals(-9, result);
    }

    @Test
    void ShouldSubtractZeroAndNegativeNumber() {
        int result = calculator.subtract(0, -9);
        Assertions.assertEquals(9, result);
    }

    @Test
    void ShouldSubtractPositiveNumberAndZero() {
        int result = calculator.subtract(10, 0);
        Assertions.assertEquals(10, result);
    }

    @Test
    void ShouldSubtractNegativeNumberAndZero() {
        int result = calculator.subtract(-10, 0);
        Assertions.assertEquals(-10, result);
    }

    @Test
    void ShouldSubtractTwoZeros() {
        int result = calculator.subtract(0, 0);
        Assertions.assertEquals(0, result);
    }

    // Multiply Multiply Multiply Multiply Multiply Multiply Multiply Multiply

    @Test
    void ShouldMultiplyTwoPositiveNumbers() {
        int result = calculator.multiply(10, 9);
        Assertions.assertEquals(90, result);
    }

    @Test
    void ShouldMultiplyOneNegativeOnePositiveNumber() {
        int result = calculator.multiply(-10, 9);
        Assertions.assertEquals(-90, result);
    }

    @Test
    void ShouldMultiplyTwoNegativeNumbers() {
        int result = calculator.multiply(-10, -9);
        Assertions.assertEquals(90, result);
    }

    @Test
    void ShouldMultiplyZeroAndPositiveNumber() {
        int result = calculator.multiply(0, 9);
        Assertions.assertEquals(0, result);
    }

    @Test
    void ShouldMultiplyZeroAndNegativeNumber() {
        int result = calculator.multiply(0, -9);
        Assertions.assertEquals(0, result);
    }

    @Test
    void ShouldMultiplyPositiveNumberAndZero() {
        int result = calculator.multiply(10, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void ShouldMultiplyNegativeNumberAndZero() {
        int result = calculator.multiply(-10, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void ShouldMultiplyTwoZeros() {
        int result = calculator.multiply(0, 0);
        Assertions.assertEquals(0, result);
    }

    // Divide Divide  Divide Divide Divide Divide Divide Divide Divide Divide

    @Test
    void ShouldDivideTwoPositiveNumbers() {
        int result = calculator.divide(10, 5);
        Assertions.assertEquals(2, result);
    }

    @Test
    void ShouldDivideOneNegativeOnePositiveNumber() {
        int result = calculator.divide(-10, 5);
        Assertions.assertEquals(-2, result);
    }

    @Test
    void ShouldDivideTwoNegativeNumbers() {
        int result = calculator.divide(-10, -5);
        Assertions.assertEquals(2, result);
    }

    @Test
    void ShouldDivideZeroAndPositiveNumber() {
        int result = calculator.divide(0, 5);
        Assertions.assertEquals(0, result);
    }

    @Test
    void ShouldDivideZeroAndNegativeNumber() {
        int result = calculator.divide(0, -5);
        Assertions.assertEquals(0, result);
    }

    @Test
    void ShouldDividePositiveNumberAndZero() {
        int result = calculator.divide(10, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void ShouldDivideNegativeNumberAndZero() {
        int result = calculator.divide(-10, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void ShouldDivideTwoZeros() {
        int result = calculator.divide(0, 0);
        Assertions.assertEquals(0, result);
    }
}