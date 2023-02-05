package lv.lv.javaguru.training.lesson13;

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
    public void shouldSumTwoNumbers() {
        int result = calculator.sum(10, 6);

        Assertions.assertEquals(16, result);
    }
}