package lv.javaguru.training.lesson5;

public class CounterSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i<=1000000; i++){

            sum+=i; //sum = sum + 1
        }
        System.out.println("total sum from 0 - 1000000 is" + sum);
    }
}
