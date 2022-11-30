package lv.javaguru.training.lesson5;

public class PrintOddNumbers {
    public static void main(String[] args) {
        System.out.println("START");
        int i = 0;
        while (i <= 10) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println("END");
    }
}
