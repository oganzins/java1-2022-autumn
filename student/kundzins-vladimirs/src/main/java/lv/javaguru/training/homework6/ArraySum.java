package lv.javaguru.training.homework6;

public class ArraySum {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 9, 11, 20};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
    }
        System.out.println(sum);
}
}
