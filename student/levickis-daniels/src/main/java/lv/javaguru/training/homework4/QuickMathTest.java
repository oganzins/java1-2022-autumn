package lv.javaguru.training.homework4;

import java.sql.SQLOutput;

public class QuickMathTest {

    public static void main(String[] args) {
        QuickMathTest testRunner = new QuickMathTest();
        testRunner.firstTest();

    }

    public void firstTest() {
        QuickMath quickMath = new QuickMath();
        int a = 3;
        int b = 5;
        int expectedResult = 5;
        int actualResult = quickMath.max(a, b);
        check(actualResult, expectedResult, "Test A =3, B =5");
    }


    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + "has passed");

        } else {

            System.out.println(testName + "has failed");
        }


    }


}
