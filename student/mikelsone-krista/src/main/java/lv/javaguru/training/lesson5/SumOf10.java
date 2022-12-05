package lv.javaguru.training.lesson5;

public class SumOf10 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while(i <= 10){
            sum += i;
            i++;
        }
        System.out.println("Total sum of numbers from 0 - 10 is " + sum);
    }
}
