package lv.javaguru.training.lesson6.homework;

import java.util.Arrays;

public class ArrayUtils {
    public int[] copy(int[] sourceArray) {
        for (int i = 0; i < sourceArray.length; i++) {
            System.out.print(sourceArray [i] + " ");
        }

        return sourceArray;
    }

    public int[] reverse(int[] sourceArray) {
        for (int i = sourceArray.length -1; i >= 0; i--) {
            System.out.print(sourceArray[i] + " ");
        }
        return sourceArray;
    }
}
