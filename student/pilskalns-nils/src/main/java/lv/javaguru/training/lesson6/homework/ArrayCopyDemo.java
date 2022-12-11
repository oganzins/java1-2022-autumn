package lv.javaguru.training.lesson6.homework;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] source = {1, 3, 5, 7};
        ArrayUtils ArrayUtils = new ArrayUtils();
        int[] copy = ArrayUtils.copy(source);

        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(copy));
    }

}

