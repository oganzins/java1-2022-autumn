package lv.javaguru.training.homework.homework6;

public class ArrayUtils {
    public int[] copy(int[] sourceArray) {
        for (int i = 0; i < sourceArray.length; i++) {
            System.out.println(sourceArray [i] + " ");
        }

    }

    public int[] reverse(int[] sourceArray) {
        int[] reverseArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            reverseArray[sourceArray.length -1 - i] = sourceArray[i];
        }
        return reverseArray;
    }
}
