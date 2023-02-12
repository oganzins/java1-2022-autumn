package lv.javaguru.training.lesson13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldSumTwoPositive() {
        int result = calculator.sum(5, 4);
        Assertions.assertEquals(9, result);
    }

    @Test
    public void shouldSumNegativePozitive() {
        int result = calculator.sum(-8, 3);
        Assertions.assertEquals(-6, result);
    }

    @Test
    public void shouldSumBothNegative() {
        int result = calculator.sum(-2, -1);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldSumZeroPozitive() {
        int result = calculator.sum(0, 4);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void shouldSumZeroNegative() {
        int result = calculator.sum(0, -2);
        Assertions.assertEquals(-2, result);
    }

    @Test
    public void shouldSumPozitiveZero() {
        int result = calculator.sum(6, 0);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void shouldSumNegativeZero() {
        int result = calculator.sum(-5, 0);
        Assertions.assertEquals(-5, result);
    }

    @Test
    public void shouldSumZero() {
        int result = calculator.sum(0, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldSumPozitive() {
        int result = calculator.subtract(10, 3);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void shouldSumNegativePozitiv() {
        int result = calculator.subtract(-10, 3);
        Assertions.assertEquals(13, result);
    }

    @Test
    public void shouldSumNegat() {
        int result = calculator.subtract(-2, -2);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void shouldSumZeroPozitiv() {
        int result = calculator.subtract(0, 3);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldSumZeroNeg() {
        int result = calculator.subtract(0, 5);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void shouldSumPozitivezero() {
        int result = calculator.subtract(10, 0);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void shouldSumNegZero() {
        int result = calculator.subtract(-5, 0);
        Assertions.assertEquals(-5, result);
    }

    @Test
    public void shouldSumZerO() {
        int result = calculator.subtract(0, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldSumPozitiv() {
        int result = calculator.multiply(9, 3);
        Assertions.assertEquals(27, result);
    }

    @Test
    public void shouldSumNegativPozitiv() {
        int result = calculator.multiply(-2, 3);
        Assertions.assertEquals(-6, result);
    }

    @Test
    public void shouldSumNega() {
        int result = calculator.multiply(-5, -5);
        Assertions.assertEquals(25, result);
    }

    @Test
    public void shouldSumZEROPOZITIV() {
        int result = calculator.multiply(0, 3);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldSumZeroNega() {
        int result = calculator.multiply(0, -6);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldSumPozZero() {
        int result = calculator.multiply(3, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldSumNegatZero() {
        int result = calculator.multiply(-8, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldSumZeroo() {
        int result = calculator.multiply(0, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldSumPoziti() {
        int result = Calculator.divide(6, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldSumNegatPoziti() {
        int result = Calculator.divide(-6, 2);
        Assertions.assertEquals(-3, result);
    }

    @Test
    public void shouldSumNEgative() {
        int result = Calculator.divide(-4, -2);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void shouldSumZerPoziti() {
        int result = Calculator.divide(0, 8);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldSumZEroNeg() {
        int result = Calculator.divide(0, -2);
        Assertions.assertEquals(0, result);
    }
}
