package lv.javaguru.training.lesson6;

import java.util.Arrays;

public class ArrayCopyDemo {

    public static void main(String[] args) {
        int[] source = {1, 3, 5, 7};
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] copy = arrayUtils.copy(source);

        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(copy));
    }
}
