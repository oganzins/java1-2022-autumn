package lv.javaguru.training.lesson13.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldCalculateSum() {
        int result1 = calculator.sum(3, 5);
        assertEquals(8, result1);

        int result2 = calculator.sum(-3,5);
        assertEquals(2, result2);

        int result3 = calculator.sum(-3,-5);
        assertEquals(-8, result3);

        int result4 = calculator.sum(0,5);
        assertEquals(5, result4);

        int result5 = calculator.sum(0,-5);
        assertEquals(-5, result5);

        int result6 = calculator.sum(3,0);
        assertEquals(3, result6);

        int result7 = calculator.sum(-3,0);
        assertEquals(-3, result7);

        int result8 = calculator.sum(0,0);
        assertEquals(0, result8);
    }

    @Test
    public void shouldCalculateSubstract() {
        int result9 = calculator.subtract(3, 5);
        assertEquals(-2, result9);

        int result10 = calculator.subtract(-3,5);
        assertEquals(-8, result10);

        int result11 = calculator.subtract(-3,-5);
        assertEquals(2, result11);

        int result12 = calculator.subtract(0,5);
        assertEquals(-5, result12);

        int result13 = calculator.subtract(0,-5);
        assertEquals(5, result13);

        int result14 = calculator.subtract(3,0);
        assertEquals(3, result14);

        int result15 = calculator.subtract(-3,0);
        assertEquals(-3, result15);

        int result16 = calculator.subtract(0,0);
        assertEquals(0, result16);
    }

    @Test
    public void shouldCalculateMultiply() {
        int result17 = calculator.multiply(3, 5);
        assertEquals(15, result17);

        int result18 = calculator.multiply(-3,5);
        assertEquals(-15, result18);

        int result19 = calculator.multiply(-3,-5);
        assertEquals(15, result19);

        int result20 = calculator.multiply(0,5);
        assertEquals(0, result20);

        int result21 = calculator.multiply(0,-5);
        assertEquals(0, result21);

        int result22 = calculator.multiply(3,0);
        assertEquals(0, result22);

        int result23 = calculator.multiply(-3,0);
        assertEquals(0, result23);

        int result24 = calculator.multiply(0,0);
        assertEquals(0, result24);
    }

    @Test
    public void shouldCalculateDivide() {
        int result25 = calculator.divide(15, 5);
        assertEquals(3, result25);

        int result26 = calculator.divide(-15,5);
        assertEquals(-3, result26);

        int result27 = calculator.divide(-15,-5);
        assertEquals(3, result27);

        int result28 = calculator.divide(0,5);
        assertEquals(0, result28);

        int result29 = calculator.divide(0,-5);
        assertEquals(0, result29);

       try { int result30 = calculator.divide(3,0);
       assertEquals( 0 ,result30);
       }
       catch (ArithmeticException e) {
           System.out.println("Arithmetic exception!");
       }

        try { int result31 = calculator.divide(-3,0);
        assertEquals( 0 ,result31);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception!");
        }

        try { int result32 = calculator.divide(0,0);
        assertEquals(0, result32);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception!");
        }
    }




}
