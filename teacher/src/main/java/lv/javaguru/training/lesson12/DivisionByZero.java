package lv.javaguru.training.lesson12;

public class DivisionByZero {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division failed!");
        } catch (Exception e) {
            System.out.println("Program failed!");
        }
    }

}
