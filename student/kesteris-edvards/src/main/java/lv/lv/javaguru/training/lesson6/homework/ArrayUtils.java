package lv.lv.javaguru.training.lesson6.homework;


public class ArrayUtils {

    public int[] copy(int[] sourceArray) {
        int[] copy = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++){
            copy[i] = sourceArray[i];
        }
        return copy;
    }

    public int[] reverse(int[] sourceArray) {
        int[] reverseArray = new int[sourceArray.length];
        for(int i = 0; i < sourceArray.length; i++){
            reverseArray[sourceArray.length - 1 - i] = sourceArray[i];
        }
        return reverseArray;
    }
}
