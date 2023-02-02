package lv.javaguru.training.lesson13.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
   private Calculator calculator;



    @BeforeEach
    public  void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void shouldSumOfTwoPositive(){
        int result = calculator.sum(3, 5);
        Assertions.assertEquals(8, result);
    }
    @Test
    public void shouldSumWithANegative(){
        int result = calculator.sum(-2, 3);
        Assertions.assertEquals(1, result);
    }
    @Test
    public void shouldSumWithBNegative(){
        int result = calculator.sum(2, -3);
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void shouldSumWithBothNegative(){
        int result = calculator.sum(-2,-2);
        Assertions.assertEquals(-4,result);
    }
    @Test
    public void shouldSumAZeroBPositive(){
        int result = calculator.sum(0,2);
        Assertions.assertEquals(2,result);
    }
    @Test
    public void shouldSumAZeroBNegative(){
        int result = calculator.sum(0,-2);
        Assertions.assertEquals(-2,result);
    }
    @Test
    public void shouldSumAPositiveBZero(){
        int result = calculator.sum(2,0);
        Assertions.assertEquals(2,result);
    }
    @Test
    public void shouldSumANegativeBZero(){
        int result = calculator.sum(-2,0);
        Assertions.assertEquals(-2,result);
    }
    @Test
    public void shouldSumAandBZero(){
        int result = calculator.sum(0,0);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void shouldSubBothPositive(){
        int result = calculator.subtract(4, 2);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void shouldSubANegativeBPositive(){
        int result = calculator.subtract(4, -2);
        Assertions.assertEquals(6, result);
    }
    @Test
    public void shouldSubBothNegative(){
        int result = calculator.subtract(-3, -2);
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void shouldSubAZeroBPositive(){
        int result = calculator.subtract(0, 2);
        Assertions.assertEquals(-2, result);
    }
    @Test
    public void shouldSubAZeroBNegative(){
        int result = calculator.subtract(0, -2);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void shouldSubAPositiveBZero(){
        int result = calculator.subtract(4, 0);
        Assertions.assertEquals(4, result);
    }
    @Test
    public void shouldSubANegativeBZero(){
        int result = calculator.subtract(-4, 0);
        Assertions.assertEquals(-4, result);
    }
    @Test
    public void shouldSubBothZero(){
        int result = calculator.subtract(0, 0);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void shouldDivBothPositive(){
        int result = calculator.divide(6,3);
        Assertions.assertEquals(2,result);
    }
    @Test
    public void shouldDivANegativeBPositive(){
        int result = calculator.divide(-3,3);
        Assertions.assertEquals(-1,result);
    }
    @Test
    public void shouldDivBothNegative(){
        int result = calculator.divide(-3,-1);
        Assertions.assertEquals(3,result);
    }
    @Test
    public void shouldDivAZeroBPositive(){
        int result = calculator.divide(0,2);
        Assertions.assertEquals(0,result);
    }
    @Test
    public void shouldDivAZeroBNegative(){
        int result = calculator.divide(0,-4);
        Assertions.assertEquals(0,result);
    }
    @Test
    public void shouldDivZeroBPositive(){
        int result = calculator.divide(0,4);
        Assertions.assertEquals(0,result);
    }
    @Test
    public void shouldNotDivideBZero(){
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(4 ,0) );
    }
    @Test
    public void shouldNotDivideBothZero(){
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(0 ,0) );
    }
    @Test
    public void shouldNotDivideAZero(){
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(4 ,0) );
    }






    @Test
    public void shouldMulBothPositive(){
        int result = calculator.multiply(6,3);
        Assertions.assertEquals(18,result);
    }
    @Test
    public void shouldMulANegativeBPositive(){
        int result = calculator.multiply(-3,3);
        Assertions.assertEquals(-9,result);
    }
    @Test
    public void shouldMulBothNegative(){
        int result = calculator.multiply(-3,-2);
        Assertions.assertEquals(6,result);
    }
    @Test
    public void shouldMulAZeroBPositive(){
        int result = calculator.multiply(0,2);
        Assertions.assertEquals(0,result);
    }
    @Test
    public void shouldMulAZeroBNegative(){
        int result = calculator.multiply(0,-4);
        Assertions.assertEquals(0,result);
    }
    @Test
    public void shouldMulAPositiveBZero(){
        int result = calculator.multiply(4, 0);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void shouldMulANegativeBZero(){
        int result = calculator.multiply(-4, 0);
        Assertions.assertEquals(0, result);
    }


    @Test
    public void shouldMulZeroBPositive(){
        int result = calculator.multiply(0,4);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void shouldMulBothZero(){
        int result = calculator.multiply(0, 0);
        Assertions.assertEquals(0, result);
    }


}