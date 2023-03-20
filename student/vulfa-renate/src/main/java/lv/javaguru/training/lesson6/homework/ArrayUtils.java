package lv.javaguru.training.lesson6.homework;

public class ArrayUtils {
    public int[] copy(int[] sourceArray){
        int[] copyArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++){
            copyArray[i] = sourceArray[i];
        }
        return copyArray;
    }

    public int[] reverse(int[] sourceArray){
        int[] reverseArray = new int[sourceArray.length];
        for (int i = sourceArray.length - 1; i >= 0; i--){
            reverseArray[sourceArray.length - 1 - i] = sourceArray[i];
        }
        return reverseArray;
    }
}
