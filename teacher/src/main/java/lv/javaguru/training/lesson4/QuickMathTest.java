package lv.javaguru.training.lesson4;

public class QuickMathTest {

    public static void main(String[] args) {
        QuickMathsTest testRunner = new QuickMathsTest();
        testRunner.firstTest();
        testRunner.secondTest();
    }

    public void firstTest() {
        QuickMathsTest quickMathsTest = new QuickMathsTest();
        int a = 3;
        int b = 5;
        int expectedResult = 5;
        int actualResult = QuickMaths.max(a, b);
        check(actualResult, expectedResult, "Test A = 4, B = 5");
    }
    public void SecondTest() {
        QuickMaths quickMaths = new QuickMaths();
        int a = 10;
        int b = 7;
        int expectedResult = 10;
        int actualResult = quickMaths.max(a, b);
        check(actualResult, expectedResult, "Test A = 10, B = 7");
    }


    private void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + "has passed!");
            System.out.println(testName + "has failed!");
        }
    }




}
