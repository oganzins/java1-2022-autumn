package lv.javaguru.training.lesson5;

public class BreakDemo {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 1000000; i++) {
            if (sum > 10000) {
                break;
            }
            sum += i;
        }
        System.out.println("Sum of 0 - 1000000 is " + sum);
    }

}
