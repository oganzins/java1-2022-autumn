package lv.javaguru.training.lesson6.Homework6;

import java.util.Arrays;

public class ArrayReverseDemo {
    public static void main(String[] args) {
        int[] source = {1, 3, 5, 7};
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] reversedArray = arrayUtils.reverse(source);

        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(reversedArray));
    }

}
