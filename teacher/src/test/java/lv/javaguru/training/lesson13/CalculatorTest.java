package lv.javaguru.training.lesson13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        System.out.println("Executing before each");
        calculator = new Calculator();
    }

    @Test
    public void shouldSumTwoNumbers() {
        int result = calculator.sum(1, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldCalculateSquare() {
        int result = calculator.square(5);
        Assertions.assertEquals(25, result);
    }

}