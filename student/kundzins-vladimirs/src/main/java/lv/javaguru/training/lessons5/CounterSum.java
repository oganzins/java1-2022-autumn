package lv.javaguru.training.lessons5;

public class CounterSum {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 1000000; i++){
            sum += i;
            //sum = sum + i;
        }
        System.out.println("Total sum for 0 - 1000000 is " + sum);
    }
}
