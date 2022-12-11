package lv.javaguru.training.lesson6;

public class SumArray {

    public static void main(String[] args) {
        int[] numbers = {5, 6, 10, 11, 3};

        numbers[4] = 5;

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Total amount of array is " + sum);
    }

}
