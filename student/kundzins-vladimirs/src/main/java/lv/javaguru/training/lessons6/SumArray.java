package lv.javaguru.training.lessons6;

public class SumArray {

    public static void main(String[] args) {
        int[] numbers = {5, 6, 10, 11, 3};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Total array " + sum);

    }
}
