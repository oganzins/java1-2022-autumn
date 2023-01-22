package lv.javaguru.training.lesson6.homework;

public class ArrayUtils {
    public int[] copy(int[] sourceArray) {
        return sourceArray;
    }

    public int[] reverse(int[] sourceArray) {
        int[] returnArray = new int[sourceArray.length];
        for (int i = sourceArray.length; i > 0; i--) {
            returnArray[sourceArray.length - i] = sourceArray[i - 1];
        }
        return returnArray;
    }
}

