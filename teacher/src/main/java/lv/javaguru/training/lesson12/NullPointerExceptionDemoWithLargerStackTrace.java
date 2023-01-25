package lv.javaguru.training.lesson12;

public class NullPointerExceptionDemoWithLargerStackTrace {

    public static void main(String[] args) {
        methodA();
    }

    private static void methodA() {
        methodB();
    }

    private static void methodB() {
        methodC();
    }

    private static void methodC() {
        String value = null;
        value.isEmpty();
    }

}
