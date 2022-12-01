package lv.javaguru.training.lesson5.Homework;

public class SumOf10 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        do {
            if (i == 1) {
                sum = 1;
            }
            if (i > 1) {
                sum += i;
            }
            i++;
        } while (i <= 10);
        System.out.println("Total sum of number from 0 - 10 is " + sum);

    }
}

