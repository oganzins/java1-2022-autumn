package lv.lv.javaguru.training.lesson13.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    //sum
    @Test
    public void sumPositiveOfAandB() {
        int result = calculator.sum(2, 2);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void sumNegativeOfAandPositiveOfB() {
        int result = calculator.sum(-3, 2);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void sumNegativeOfAandNegativeOfB() {
        int result = calculator.sum(-3, -12);
        Assertions.assertEquals(-15, result);
    }

    @Test
    public void sumNullOfAandPositiveOfB() {
        int result = calculator.sum(0, 5);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void sumNullOfAandNegativeOfB() {
        int result = calculator.sum(0, -5);
        Assertions.assertEquals(-5, result);
    }

    @Test
    public void sumPositiveOfAandNullOfB() {
        int result = calculator.sum(6, 0);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void sumNegativeOfAandNullOfB() {
        int result = calculator.sum(-6, 0);
        Assertions.assertEquals(-6, result);
    }

    @Test
    public void sumNullOfAandNullOfB() {
        int result = calculator.sum(0, 0);
        Assertions.assertEquals(0, result);
    }

    //subtract
    @Test
    public void subtractPositiveOfAandB() {
        int result = calculator.subtract(2, 2);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void subtractNegativeOfAandPositiveOfB() {
        int result = calculator.subtract(-3, 2);
        Assertions.assertEquals(-5, result);
    }

    @Test
    public void subtractNegativeOfAandNegativeOfB() {
        int result = calculator.subtract(-3, -12);
        Assertions.assertEquals(9, result);
    }

    @Test
    public void subtractNullOfAandPositiveOfB() {
        int result = calculator.subtract(0, 5);
        Assertions.assertEquals(-5, result);
    }

    @Test
    public void subtractNullOfAandNegativeOfB() {
        int result = calculator.subtract(0, -5);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void subtractPositiveOfAandNullOfB() {
        int result = calculator.subtract(6, 0);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void subtractNegativeOfAandNullOfB() {
        int result = calculator.subtract(-6, 0);
        Assertions.assertEquals(-6, result);
    }

    @Test
    public void subtractNullOfAandNullOfB() {
        int result = calculator.subtract(0, 0);
        Assertions.assertEquals(0, result);
    }

    //multiply
    @Test
    public void multiplyPositiveOfAandB() {
        int result = calculator.multiply(2, 2);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void multiplyNegativeOfAandPositiveOfB() {
        int result = calculator.multiply(-3, 2);
        Assertions.assertEquals(-6, result);
    }

    @Test
    public void multiplyNegativeOfAandNegativeOfB() {
        int result = calculator.multiply(-3, -12);
        Assertions.assertEquals(36, result);
    }

    @Test
    public void multiplyNullOfAandPositiveOfB() {
        int result = calculator.multiply(0, 5);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void multiplyNullOfAandNegativeOfB() {
        int result = calculator.multiply(0, -5);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void multiplyPositiveOfAandNullOfB() {
        int result = calculator.multiply(6, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void multiplyNegativeOfAandNullOfB() {
        int result = calculator.multiply(-6, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void multiplyNullOfAandNullOfB() {
        int result = calculator.multiply(0, 0);
        Assertions.assertEquals(0, result);
    }

    //divide
    @Test
    public void dividePositiveOfAandB() {
        int result = calculator.divide(2, 2);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void divideNegativeOfAandPositiveOfB() {
        int result = calculator.divide(-6, 3);
        Assertions.assertEquals(-2, result);
    }

    @Test
    public void divideNegativeOfAandNegativeOfB() {
        int result = calculator.divide(-12, -3);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void divideNullOfAandPositiveOfB() {
        int result = calculator.divide(0, 5);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void divideNullOfAandNegativeOfB() {
        int result = calculator.divide(0, -5);
        Assertions.assertEquals(-0, result);
    }

    @Test
    public void dividePositiveOfAandNullOfB() {
        Assertions.assertThrows(ArithmeticException.class,
                () -> calculator.divide(6, 0)
        );
    }

    @Test
    public void divideNegativeOfAandNullOfB() {
        Assertions.assertThrows(ArithmeticException.class,
                () -> calculator.divide(-6, 0)
        );
    }

    @Test
    public void divideNullOfAandNullOfB() {
        Assertions.assertThrows(ArithmeticException.class,
                () -> calculator.divide(0, 0)
        );
    }
}