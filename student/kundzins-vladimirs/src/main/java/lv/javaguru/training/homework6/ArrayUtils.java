package lv.javaguru.training.homework6;

public class ArrayUtils {

    public int[] copy(int[] sourceArray) {
        int[] copy = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            copy[i] = sourceArray[i];
        }
        return copy;
    }

    public int[] reverse(int[] sourceArray) {
        int[] reversedArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            reversedArray[sourceArray.length - 1 - i] = sourceArray[i];
        }
        return sourceArray;
    }

}
