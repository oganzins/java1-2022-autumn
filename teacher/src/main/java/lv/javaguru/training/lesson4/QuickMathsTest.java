package lv.javaguru.training.lesson4;

public class QuickMathsTest {

    public static void main(String[] args) {
        QuickMathsTest testRunner = new QuickMathsTest();
        testRunner.firstTest();
        testRunner.secondTest();
    }

    public void firstTest() {
        QuickMaths quickMaths = new QuickMaths();
        int a = 3;
        int b = 5;
        int expectedResult = 5;
        int actualResult = quickMaths.max(a, b);
        check(actualResult, expectedResult, "Test A = 3, B = 5");
    }

    public void secondTest() {
        QuickMaths quickMaths = new QuickMaths();
        int a = 10;
        int b = 7;
        int expectedResult = 10;
        int actualResult = quickMaths.max(a, b);
        check(actualResult, expectedResult, "Test A = 10, B = 7");
    }

    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
        }
    }

}
