package lv.javaguru.training.lesson5.homework;

public class SumOf10 {

    public static void main(String[] args) {
        int sum = 0;
        do {
            for (int i = 0; i <= 10; i++) {
                sum += i;
            }

        } while (sum <= 10);
        System.out.println("Total sum of numbers from 0 - 10 is " + sum);
    }

}
