package lv.javaguru.training.lesson5.Homework5;

public class SumOf10 {
    public static void main(String[] args) {
        int sum = 0, i = 0;

        do{
            sum += i;
            i++;
        } while (i <= 10);

        System.out.println("Total sum of numbers from 0 - 10 is " + sum);
    }
}
