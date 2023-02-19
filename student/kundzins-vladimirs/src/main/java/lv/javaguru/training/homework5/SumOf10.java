package lv.javaguru.training.homework5;

public class SumOf10 {

    public static void main(String[] args) {

        int sum = 1;
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

        System.out.println("Total sum of numbers from 0 - 10 is " + sum);


    }
}
