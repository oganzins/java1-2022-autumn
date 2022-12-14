package lv.javaguru.training.lesson6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LoadArrayWithCounterValue {
    public static void main(String[] args) {
        int[] numbers = new int [10];

        for(int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
